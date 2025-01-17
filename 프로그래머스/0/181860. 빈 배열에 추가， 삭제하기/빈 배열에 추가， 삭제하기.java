import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> listArr = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    listArr.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    listArr.remove(listArr.size() - 1);
                }
            }
        }
        
        int[] answer = new int[listArr.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = listArr.get(i);
        }
        return answer;
    }
}