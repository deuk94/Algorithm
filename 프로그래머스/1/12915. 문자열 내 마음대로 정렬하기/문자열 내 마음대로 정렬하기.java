import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        String[] strArr = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            strArr[i] = strings[i].substring(n, n + 1) + strings[i];
        }
        
        Arrays.sort(strArr);
        
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].substring(1);
        }
        
        return answer;
    }
}