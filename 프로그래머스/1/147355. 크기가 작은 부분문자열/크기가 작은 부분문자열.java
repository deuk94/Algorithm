class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        
        for (int i = 0; i < t.length(); i++) {
            if (p.length() + i <= t.length()) {
                long num = Long.parseLong(t.substring(i, i + p.length()));
                if (Long.parseLong(p) >= num) {
                    answer++;
                }
            }
        }
        return answer;
    }
}