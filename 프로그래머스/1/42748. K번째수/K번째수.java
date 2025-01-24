import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            int idx = 0;
            int[] arr = new int[end - start + 1];
            for (int j = start - 1; j < end; j++) {
                arr[idx] = array[j];
                idx++;
            }
            idx = 0;
            Arrays.sort(arr);
            answer[i] = arr[k - 1];
        }
        return answer;
    }
}