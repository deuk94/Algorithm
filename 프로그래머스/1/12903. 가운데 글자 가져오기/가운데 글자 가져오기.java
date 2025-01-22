class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        if (arr.length % 2 != 0) {
            answer += arr[arr.length / 2];
        } else {
            answer = s.substring((arr.length/2) - 1, (arr.length/2) + 1);
        }
        return answer;
    }
}