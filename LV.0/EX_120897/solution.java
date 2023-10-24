import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i <= n; i++) {
            if(n%i == 0) {
                list.add(i);
                System.out.print(i + " ");
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int j=0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}
