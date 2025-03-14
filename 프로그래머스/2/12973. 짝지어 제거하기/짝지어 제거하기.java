import java.util.*;;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek().equals(arr[i])) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }
        
        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}