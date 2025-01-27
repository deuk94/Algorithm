class Solution {
    public String solution(String code) {
        String answer = "";
        String[] strArr = code.split("");
        int mode = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (mode == 0) {
                if (strArr[i].equals("1")) {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        answer += strArr[i];
                    }
                }
            } else {
                if (strArr[i].equals("1")) {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        answer += strArr[i];
                    }
                }
            }
        }
        
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
        return answer;
    }
}