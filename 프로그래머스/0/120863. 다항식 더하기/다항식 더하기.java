class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int sumX = 0;
        int sumNum = 0;
        String[] strArr = polynomial.split(" ");
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("x")) {
                if (strArr[i].length() == 1) {
                    sumX++;
                } else {
                    sumX += Integer.parseInt(strArr[i].substring(0, strArr[i].length() - 1));
                }
            } else if (strArr[i].equals("+")) {
                continue;
            } else {
                sumNum += Integer.parseInt(strArr[i]);
            }
        }
        String x = "";
        if (sumX > 1) {
            x = sumX + "x";
        } else if (sumX == 1) {
            x = "x";
        }
        
        String num = "";
        if (sumNum > 0 && sumX > 0) {
            num = " + " + Integer.toString(sumNum);
        } else if (sumNum >= 0 && sumX == 0) {
            num = Integer.toString(sumNum);
        }
        
        answer = x + num;
        return answer;
    }
}