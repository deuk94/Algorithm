class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum = 0;
        int arr2Sum = 0;
        
        for (int i : arr1) {
            arr1Sum += i;
        }
        
        for (int j : arr2) {
            arr2Sum += j;
        }
        
        if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length) {
            if (arr1Sum > arr2Sum) {
                answer = 1;
            } else if (arr1Sum == arr2Sum) {
                answer = 0;
            } else {
                answer = -1;
            }
        } else {
            answer = 1;
        }
        return answer;
    }
}