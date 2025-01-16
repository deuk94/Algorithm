class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int a1 = a + b + c;
        int b1 = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int c1 = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        
        if (a == b && b == c && a == c) {
            answer = a1 * b1 * c1;
        } else if (a != b && b != c && a != c) {
            answer = a1;
        } else {
            answer = a1 * b1;
        }
        return answer;
    }
}