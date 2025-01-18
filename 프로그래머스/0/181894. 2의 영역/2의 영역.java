import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> listArr = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                listArr.add(i);
            }
        }
        
        if (listArr.size() == 0) {
            return new int[]{-1};
        }
        
        answer = Arrays.copyOfRange(arr, listArr.get(0), listArr.get(listArr.size() - 1) + 1);
        return answer;
    }
}