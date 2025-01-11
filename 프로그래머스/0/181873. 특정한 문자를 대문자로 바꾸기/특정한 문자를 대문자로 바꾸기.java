class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (String.valueOf(currentChar).equals(alp)) {
                answer += Character.toUpperCase(currentChar);
            } else {
                answer += currentChar;
            }
        }
        return answer;
    }
}