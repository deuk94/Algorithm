class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        if ((2 * a * b) > Integer.parseInt(strA + strB)) {
            answer = (2 * a * b);
        } else {
            answer = Integer.parseInt(strA + strB);
        }
        return answer;
    }
}