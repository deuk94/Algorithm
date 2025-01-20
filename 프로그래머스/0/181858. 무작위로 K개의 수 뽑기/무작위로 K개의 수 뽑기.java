import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> arrSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arrSet.add(arr[i]);
        }
        
        List<Integer> arrList = new ArrayList<>(arrSet);
        
        for (int i = 0; i < k; i++) {
            if (arrList.size() >= k) {
                answer[i] = arrList.get(i);
            } else {
                if (i < arrList.size()) {
                    answer[i] = arrList.get(i);
                } else {
                    answer[i] = -1;
                }
            }
        }

        return answer;
    }
}