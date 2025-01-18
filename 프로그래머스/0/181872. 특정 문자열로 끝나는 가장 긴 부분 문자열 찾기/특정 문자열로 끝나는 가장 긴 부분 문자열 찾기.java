class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length(); i >= 0; i--) {
            String str = myString.substring(0, i);
            if (str.endsWith(pat)) {
                answer = str;
                break;
            }
        }
        return answer;
    }
}