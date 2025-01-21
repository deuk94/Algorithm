import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                arr.add(rank[i]);
            }
        }
        
        Collections.sort(arr);
        int[] arr1 = new int[arr.size()];
        int idx = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < rank.length; j++) {
                if (arr.get(i) == rank[j]) {
                    arr1[idx] = j;
                    idx++;
                }
            }
        }
        answer = (10000 * arr1[0]) + (100 * arr1[1]) + arr1[2];
        return answer;
    }
}