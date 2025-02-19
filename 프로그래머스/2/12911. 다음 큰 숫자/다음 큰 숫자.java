class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toBinaryString(n);
        int aCnt = count(a);
        for (int i = n + 1; i < 1000000; i++) {
            String b = Integer.toBinaryString(i);
            int bCnt = count(b);
            if (aCnt == bCnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public int count(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}