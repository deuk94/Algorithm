class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int widthMax = Math.max(Math.max(dots[0][0], dots[1][0]), Math.max(dots[2][0], dots[3][0]));
        int widthMin = Math.min(Math.min(dots[0][0], dots[1][0]), Math.min(dots[2][0], dots[3][0]));
        
        int heightMax = Math.max(Math.max(dots[0][1], dots[1][1]), Math.max(dots[2][1], dots[3][1]));
        int heightMin = Math.min(Math.min(dots[0][1], dots[1][1]), Math.min(dots[2][1], dots[3][1]));
        
        answer = (widthMax - widthMin) * (heightMax - heightMin);
        return answer;
    }
}