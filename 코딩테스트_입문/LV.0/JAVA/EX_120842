public int[][] solution(int[] num_list, int n) {
    int len = num_list.length;
    int[][] answer = new int[len/n][n];
    int x = 0;
    int y = 0; 
        
    for(int i = 0; i < len; i++) {
      if(y == n) {
        x++;
        y = 0;
      }
      answer[x][y++] = num_list[i];
    }
    
    
    return answer;
}

// 나누기 사용
public int[][] solution(int[] num_list, int n) {
    int len = num_list.length;
    int[][] answer = new int[len/n][n];

    for(int i = 0; i < len; i++) {
        answer[i/n][i%n] = num_list[i];
    }
    
    return answer;
}
