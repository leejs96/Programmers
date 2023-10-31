class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int x2 = 0;
        int y1 = dots[0][1];
        int y2 = 0;
        
        for(int i = 1; i < dots.length; i++) {
            x2 = x1 != dots[i][0] ? dots[i][0] : x2;
            y2 = y1 != dots[i][1] ? dots[i][1] : y2;
        }
        
        int width = Math.abs(x1 - x2);
        int height = Math.abs(y1 - y2);
        
        int answer = width * height;
        return answer;
    }
}
