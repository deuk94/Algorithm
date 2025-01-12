class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        
        for (int num : num_list) {
            if (num_list.length >= 11) {
                answer += num;
            } else {
                mul *= num; 
            }
        }
        
        if (num_list.length >= 11) {
            return answer;
        } else {
            return mul;
        }
    }
}