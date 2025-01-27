class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 0; i < food.length; i++) {
            if (food[i] == 1) {
                continue;
            } else {
                answer += Integer.toString(i).repeat(food[i] / 2);
            }
        }
        
        answer += "0";
        
        for (int i = food.length - 1; i >= 1; i--) {
            if (food[i] == 1) {
                continue;
            } else {
                answer += Integer.toString(i).repeat(food[i] / 2);
            }
        }
        return answer;
    }
}