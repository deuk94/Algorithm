import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int[] reverseB = new int[B.length];
        for (int i = B.length - 1, j = 0; i >= 0; i--, j++) {
            reverseB[j] = B[i];
        }

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * reverseB[i];
        }
        return answer;
    }
}