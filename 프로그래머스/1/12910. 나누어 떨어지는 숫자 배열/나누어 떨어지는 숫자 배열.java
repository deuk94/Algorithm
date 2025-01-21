import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }
        if (arrList.size() == 0) {
            arrList.add(-1);
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}