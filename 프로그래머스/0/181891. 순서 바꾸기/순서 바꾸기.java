import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numList = new ArrayList<>();
        
        for (int i = n; i < num_list.length; i++) {
            numList.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            numList.add(num_list[i]);
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}