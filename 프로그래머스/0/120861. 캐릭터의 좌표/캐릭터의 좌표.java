class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int maxRL = board[0] / 2;
        int maxUD = board[1] / 2;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                answer[0]--;
                if (answer[0] < -maxRL) {
                    answer[0] = -maxRL;
                }
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if (answer[0] > maxRL) {
                    answer[0] = maxRL;
                }
            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if (answer[1] > maxUD) {
                    answer[1] = maxUD;
                }
            } else {
                answer[1]--;
                if (answer[1] < -maxUD) {
                    answer[1] = -maxUD;
                }
            }
        }
        return answer;
    }
}