import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        
        for (int i = 1; i < arr.length; i++) {
            arrList.add(arr1[i]);
        }
        
        int idx = 0;
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrList.size(); j++) {
                if (arr[i] == arrList.get(j)) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }
        }
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }
}