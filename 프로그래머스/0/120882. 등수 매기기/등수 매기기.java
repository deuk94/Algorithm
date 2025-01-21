import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] DArr = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            DArr[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        double[] arr = Arrays.copyOf(DArr, score.length);
        Arrays.sort(arr);
        
        double[] arr1 = new double[arr.length];
        int idx = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            arr1[idx] = arr[i];
            idx++;
        }
        
        for (int i = 0; i < DArr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (DArr[i] == arr1[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}