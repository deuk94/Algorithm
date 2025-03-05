import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop(); 
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}