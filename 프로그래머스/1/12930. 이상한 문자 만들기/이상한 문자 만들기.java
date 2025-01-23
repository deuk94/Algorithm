class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ", -1);
        
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (j % 2 == 0) {
                    answer += Character.toUpperCase(strArr[i].charAt(j));
                } else {
                    answer += Character.toLowerCase(strArr[i].charAt(j));
                }
            }
            if (i < strArr.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}