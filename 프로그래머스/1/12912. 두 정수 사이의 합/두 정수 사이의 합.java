class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        
        for (long i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}