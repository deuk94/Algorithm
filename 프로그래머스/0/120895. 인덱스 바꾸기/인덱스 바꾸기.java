class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] my_char = my_string.toCharArray();
        
        my_char[num1] = my_string.charAt(num2);
        my_char[num2] = my_string.charAt(num1);
        
        for (char str : my_char) {
            answer += str;
        }
        
        return answer;
    }
}