class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int max = 0;
        
        for (int i = 1; i <= denom && i <= numer; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        
        answer[1] = denom / max;
        answer[0] = numer / max;
        return answer;
    }
}