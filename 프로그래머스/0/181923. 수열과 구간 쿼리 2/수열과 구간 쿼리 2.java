import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0 ; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && min > arr[j]) {
                    min = arr[j];
                }
            }
            if (min == Integer.MAX_VALUE) {
                arrList.add(-1);
            } else {
                arrList.add(min);
            }
        }
        
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}