import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> arrList = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String[] arr = picture[i].split("");
            String str = "";
            for (int j = 0; j < arr.length; j++) {
                str += arr[j].repeat(k);
            }
            
            for (int j = 0; j < k; j++) {
                arrList.add(str);
            }
        }
        
        String[] answer = new String[picture.length * k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}