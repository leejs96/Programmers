import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0; 
        
        Arrays.sort(d);
        
        for(int cost : d) {
            total += cost;
            
            if(budget >= total) {
                answer++;
            }
        }
        
        return answer;
    }
}
