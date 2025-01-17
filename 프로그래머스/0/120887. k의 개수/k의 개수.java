import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = Integer.toString(k);
        String str1 = "";
        
        for (int a = i; a <= j; a++) {
            str1 += Integer.toString(a);
        }
        
        for (int a = 0; a < str1.length(); a++) {
            if (str1.charAt(a) == str.charAt(0)) {
                answer++;
            }
        }
        
        return answer;
    }
}