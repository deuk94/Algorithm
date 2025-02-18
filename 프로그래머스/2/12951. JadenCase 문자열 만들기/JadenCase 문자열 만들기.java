class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        s = " " + s;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                answer += Character.toUpperCase(s.charAt(i));
            } else {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}