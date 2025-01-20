class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int num = 1;
        
        for (int i = share + 1; i <= balls; i++) {
            answer *= i;
            answer /= num;
            num++;
        }
        return (int)answer;
    }
}