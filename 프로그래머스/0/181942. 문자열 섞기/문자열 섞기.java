class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        
        for (int i = 0; i < arr1.length; i++) {
            answer += arr1[i] + arr2[i];
        }
        return answer;
    }
}