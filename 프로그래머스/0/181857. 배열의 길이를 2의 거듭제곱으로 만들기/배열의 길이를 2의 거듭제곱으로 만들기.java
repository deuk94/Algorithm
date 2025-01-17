import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int arrLength = 1;
        
        while (arrLength < arr.length) {
            arrLength *= 2;
        }
        return Arrays.copyOf(arr, arrLength);
    }
}