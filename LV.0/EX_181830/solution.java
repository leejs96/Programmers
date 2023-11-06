import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int column = arr.length;
        int row = arr[0].length;
        int len = column > row ? column : row; // Math.max(column, row)
        
        int[][] answer = new int[len][len];
        
        for(int i = 0; i < column; i++) {
            answer[i] = Arrays.copyOfRange(arr[i], 0, len);
        }
        
        return answer;
    }
}
