import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
                System.out.print(i);
            }
        }
        
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count = 0;
            for (int j = 2; j <= arr.get(i); j++) {
                if (arr.get(i) % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                arr1.add(arr.get(i));
            }
        }
        
        int[] answer = new int[arr1.size()];
        for (int i = 0; i < arr1.size(); i++) {
            answer[i] = arr1.get(i);
        }
        return answer;
    }
}