class Solution {
    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];
        
        int idx = 0;
        for (int i = str.length-1; i >= 0; i--) {
            answer[idx] = Integer.parseInt(str[i]);
            idx++;
        }
        return answer;
    }
}