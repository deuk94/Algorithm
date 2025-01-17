import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            intStrs[i] = intStrs[i].substring(s, s+l);
        }
        
        for (int i = 0; i < intStrs.length; i++) {
            if (Integer.parseInt(intStrs[i]) > k) {
                arr.add(Integer.parseInt(intStrs[i]));
            }
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}