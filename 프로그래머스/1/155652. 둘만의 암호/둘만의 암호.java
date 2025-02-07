import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> arrList = new ArrayList<>();
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        
        for (char i = 'a'; i <= 'z'; i++) {
            arrList.add(i);
        }

        for (int i = 0; i < skipArr.length; i++) {
            arrList.remove(Character.valueOf(skipArr[i]));
        }

        for (int i = 0; i < sArr.length; i++) {
            int pos = arrList.indexOf(sArr[i]);
            if (pos != -1) {
                int newIndex = (pos + index) % arrList.size();
                answer += arrList.get(newIndex);
            }
        }
        return answer;
    }
}