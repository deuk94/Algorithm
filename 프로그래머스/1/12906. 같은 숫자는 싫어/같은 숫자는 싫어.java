import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arrList.add(arr[i]);
            }
        }
        arrList.add(0);
        
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        answer[answer.length - 1] = arr[arr.length - 1];
        return answer;
    }
}