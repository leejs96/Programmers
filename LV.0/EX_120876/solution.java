import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[][] lines) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        
        for(int i=0; i < lines.length-1; i++) {
            for(int j = i+1; j < lines.length; j++) {
                int len = 0;
                int cnt = 0;
                
                for(int k = lines[i][0]; k <= lines[i][1]; k++) {
                    if(k >= lines[j][0] && k <= lines[j][1]) {
                        if(set.contains(k)) {
                            cnt++;
                        }
                        set.add(k);
                        len++;
                    }
                }
                
                answer += len != 0 ? len-1 : 0;
                if(cnt > 1) {
                    answer -= cnt-1;
                }
            }
        }
        return answer;
    }
}
