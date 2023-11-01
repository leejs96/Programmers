class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[] dan = {-1, 0, 1};
        int[][] danSites = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int k : dan) {
                        if(i+k >= 0 && i+k < n) {
                            for(int l : dan) {
                                if(j+l >= 0 && j+l < n) {
                                    danSites[i+k][j+l] = 1;
                                }
                            }
                        }
                    }
                }
                
            }
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
            	if(danSites[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}
