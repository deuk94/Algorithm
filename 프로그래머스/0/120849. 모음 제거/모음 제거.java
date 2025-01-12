class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] n = {"a", "e", "i", "o", "u"};
        
        for (String i : n) {
            answer = answer.replace(i, "");
        }
        return answer;
    }
}