import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger c = new BigInteger(a);
        BigInteger d = new BigInteger(b);
        BigInteger sum = c.add(d);
        
        answer = sum.toString();
        return answer;
    }
}