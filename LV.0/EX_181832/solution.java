class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i = 0;
		int j = 0;
		int cnt = 1;
		
		String s = "right";
		
		while(cnt <= n*n) {
			answer[i][j] = cnt++;
			
			if(s.equals("right")) {
				if(j == n-1 || answer[i][j+1] != 0) {
					s = "down";
					i++;
				} else {
					j++;
				}
			} else if(s.equals("down")) {
				if(i == n-1 || answer[i+1][j] != 0) {
					s = "left";
					j--;
				} else {
					i++;
				}
			} else if(s.equals("left")) {
				if(j == 0 || answer[i][j-1] != 0) {
					s = "up";
					i--;
				} else {
					j--;
				}
			} else if(s.equals("up")){
				if(i == 0 || answer[i-1][j] != 0) {
					s = "right";
					j++;
				} else {
					i--;
				}
			}
        }
        
        return answer;
    }
}
