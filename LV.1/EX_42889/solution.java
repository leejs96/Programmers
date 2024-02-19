class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] players = new int[N];
        int[] notClear = new int[N];

        double[][] failPercent = new double[N][2];

        for(int i = 0; i < stages.length; i++) {
            int now = stages[i];

            if(now <= N) {
                notClear[now - 1]++; // 각 라운드 당 실패한 수
            }

            for(int j = 0; j < now; j++) {
                if(j != N) {
                    players[j]++; // 각 라운드 도전자 수
                }
            }
        }

        for(int i = 0; i < N; i++) {
            failPercent[i][0] = players[i] == 0 ? 0 : (double)notClear[i] / (double)players[i];
            failPercent[i][1] = (double)(i + 1);
        }

        for(int i = 0; i < N-1; i++) {
            for(int j = i; j < N; j++) {
                if(failPercent[i][0] > failPercent[j][0]) {
                    double temp = failPercent[i][0];
                    failPercent[i][0] = failPercent[j][0];
                    failPercent[j][0] = temp;

                    double tempIdx = failPercent[i][1];
                    failPercent[i][1] = failPercent[j][1];
                    failPercent[j][1] = tempIdx;

                } else if(failPercent[i][0] == failPercent[j][0]) {
                    if(failPercent[i][1] < failPercent[j][1]) {
                        double temp = failPercent[i][0];
                        failPercent[i][0] = failPercent[j][0];
                        failPercent[j][0] = temp;

                        double tempIdx = failPercent[i][1];
                        failPercent[i][1] = failPercent[j][1];
                        failPercent[j][1] = tempIdx;
                    }
                }
            }

        }

        for(int i = N; i > 0; i--) {
            answer[N-i] = (int)failPercent[i-1][1];
        }

        return answer;
    }

}
