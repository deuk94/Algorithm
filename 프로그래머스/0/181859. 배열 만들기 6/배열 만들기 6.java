import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arrList.size() == 0) {
                arrList.add(arr[i]);
            } else {
                if (arr[i] == arrList.get(arrList.size() - 1)) {
                    arrList.remove(arrList.size() - 1);
                } else {
                    arrList.add(arr[i]);
                }
            }
        }
        int[] answer = new int[arrList.size()];
        if (arrList.size() == 0) {
            answer = new int[]{-1};
        } else {
            for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
            }
        }
        return answer;
    }
}