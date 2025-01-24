import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (arrList.size() < k) {
                arrList.add(score[i]);
            } else {
                if (arrList.get(0) < score[i]) {
                    arrList.remove(0);
                    arrList.add(score[i]);
                }
            }
            Collections.sort(arrList);
            answer[i] = arrList.get(0);
        }
        return answer;
    }
}