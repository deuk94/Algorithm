class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            for (int j = a; j <= (a + b) / 2; j++) {
                char temp = ch[j];
                ch[j] = ch[a + b - j];
                ch[a + b - j] = temp;
            }
        }
        
        for (int i = 0; i < ch.length; i++) {
            answer += ch[i];
        }
        return answer;
    }
}