class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replaceAll(arr[i], Integer.toString(i));
        }
        
        answer = Long.parseLong(numbers);
        return answer;
    }
}