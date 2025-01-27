import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arrList.size() == 0) {
                arrList.add(arr[i]);
            } else {
                if (arr[i] <= arrList.get(arrList.size() - 1)) {
                    arrList.remove(arrList.size() - 1);
                    i--;
                } else {
                    arrList.add(arr[i]);
                }
            }
        }
        
        int[] stk = new int[arrList.size()];
        for (int i = 0; i < stk.length; i++) {
            stk[i] = arrList.get(i);
        }
        return stk;
    }
}