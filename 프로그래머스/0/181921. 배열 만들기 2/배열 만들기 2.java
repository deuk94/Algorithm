import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = Integer.toString(i);
            String[] strArr = str.split("");
            int count = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("0") || strArr[j].equals("5")) {
                    count++;
                }
            }
            if (count == strArr.length) {
                arrList.add(i);
            }
            count = 0;
        }
        
        int[] answer = new int[arrList.size()];
        if (arrList.size() == 0) {
            answer = new int[] {-1};
        } else {
            for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
            }
        }
        
        return answer;
    }
}