class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = (long)Math.sqrt(n);
        
        if (a * a == n) {
            answer = (long)Math.pow(a+1, 2); 
        } else {
            answer = -1;
        }
        
        return answer;
    }
}