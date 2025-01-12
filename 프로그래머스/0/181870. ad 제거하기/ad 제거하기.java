import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> str = new ArrayList<>();
        
        for (String i : strArr) {
            if (!i.contains("ad")) {
                str.add(i);
            }
        }
        
        String[] answer = new String[str.size()];
        
        for (int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i);
        }
        return answer;
    }
}