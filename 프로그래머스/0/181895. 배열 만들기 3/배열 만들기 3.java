import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> listArr = new ArrayList<>();

        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            listArr.add(arr[i]);
        }
        
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            listArr.add(arr[i]);
        }
        
        int[] answer = new int[listArr.size()];
        for (int i = 0; i < listArr.size(); i++) {
            answer[i] = listArr.get(i);
        }
        return answer;
    }
}