import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> result = new ArrayList<>();
        
        for (int i : arr) {
            result.add(i);
            for (int list : delete_list) {
                if (i == list) {
                    result.remove((Integer)i);
                }
            }
        }
        
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}