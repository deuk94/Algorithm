class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int sum : numbers) {
            answer += sum;
            if (answer > n) {
                return answer;
            }
        }
        return answer;
    }
}