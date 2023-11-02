class Solution {
    public int solution(int[][] dots) {
        for(int i = 1; i < 4; i++) {
            int dot1 = i;
            int dot2 = i + 1 <= 3 ? i+1 : (i+1) % 3;
            int dot3 = i + 2 <= 3 ? i+2 : (i+2) % 3;

            double incon1 = (double)(dots[0][1] - dots[dot1][1]) / (double)(dots[0][0] - dots[dot1][0]);
            double incon2 = (double)(dots[dot2][1] - dots[dot3][1]) / (double)(dots[dot2][0] - dots[dot3][0]);
            if(incon1 == incon2) {
                return 1;
            }
        }

        int answer = 0;
        return answer;
    }
}
