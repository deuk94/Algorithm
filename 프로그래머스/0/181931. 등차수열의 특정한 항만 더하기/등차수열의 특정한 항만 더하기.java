class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arr = new int[included.length];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = a + (i * d);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (included[i] == true) {
                answer += arr[i];
            }
        }
        return answer;
    }
}