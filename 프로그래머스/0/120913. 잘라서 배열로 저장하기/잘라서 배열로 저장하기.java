import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            if (i+n > my_str.length()) {
                arr.add(my_str.substring(i));
            } else {
                arr.add(my_str.substring(i, i+n));
            }
        }
        
        String[] answer = new String[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}