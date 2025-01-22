import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        List<String> upperArr = new ArrayList<>();
        List<String> lowerArr = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperArr.add(arr[i]);
            } else {
                lowerArr.add(arr[i]);
            }
        }
        
        Collections.sort(upperArr);
        Collections.reverse(upperArr);
        Collections.sort(lowerArr);
        Collections.reverse(lowerArr);
        
         for (int i = 0; i < lowerArr.size(); i++) {
            answer += lowerArr.get(i);
        }
        
        for (int i = 0; i < upperArr.size(); i++) {
            answer += upperArr.get(i);
        }
        return answer;
    }
}