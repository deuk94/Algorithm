import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            arr.add(my_string.substring(i, i + m));
        }
        
        for (int i = 0; i < arr.size(); i++) {
            answer += arr.get(i).charAt(c - 1);
        }
        return answer;
    }
}