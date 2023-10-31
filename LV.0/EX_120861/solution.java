class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int w_max = board[0] / 2;
        int h_max = board[1] / 2;
        
        for(String key : keyinput) {
            switch(key) {
                case "up" : answer[1] += answer[1] != h_max ? 1 : 0; break;
                case "down" : answer[1] -= answer[1] != h_max*-1 ? 1 : 0; break;
                case "left" : answer[0] -= answer[0] != w_max*-1 ? 1 : 0; break;
                case "right" : answer[0] += answer[0] != w_max ? 1 : 0; break;
            }
        }
        
        return answer;
    }
    
}
