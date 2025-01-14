class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr = Integer.toString(n).split("");
        
        for (String i : arr) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}