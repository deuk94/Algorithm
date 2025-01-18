class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(array[i] - n)) < max) {
                max = Math.abs(array[i] - n);
                answer = array[i];
            } else if ((Math.abs(array[i] - n)) == max && answer > array[i]) {
                max = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        return answer;
    }
}