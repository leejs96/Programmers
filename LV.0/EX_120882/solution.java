class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        float[] avg = new float[len];
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            avg[i] = (float)(score[i][0] + score[i][1]) / 2;
        }
        
        for(int i = 0; i < len; i++) {
            answer[i]++;
            for(int j = 0; j < len; j++) {
                if(avg[i] < avg[j]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
