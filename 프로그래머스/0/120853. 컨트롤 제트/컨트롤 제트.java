class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                if (Integer.parseInt(arr[i - 1]) < 0) {
                    answer += Math.abs(Integer.parseInt(arr[i - 1]));
                } else {
                    answer -= Integer.parseInt(arr[i - 1]);
                }
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}