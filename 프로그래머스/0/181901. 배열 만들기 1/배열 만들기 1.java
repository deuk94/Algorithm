class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / 3 == 0 ? n / k + 1 : n / k];
        
        int idx = 0;
        for (int i = k; i <= n; i+=k) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}