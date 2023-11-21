import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> result = new Stack<>();
        
        int len = board.length;
        int answer = 0;
        
        for(int i : moves) {
            for(int j = 0; j < len; j++) {
                int doll = board[j][i-1];
                if(doll != 0) {
                    board[j][i-1] = 0;
                    
                    if(!result.empty() && result.peek() == doll) {
                        result.pop();
                        answer += 2;
                    } else {
                        result.push(doll);
                    }
                    
                    break;
                }
            }
        }
        return answer;
    }
}
