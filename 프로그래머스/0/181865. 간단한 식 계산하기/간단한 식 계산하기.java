class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String c = arr[1];
        
        if (c.equals("+")) {
            answer = a + b;
        } else if (c.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }
}