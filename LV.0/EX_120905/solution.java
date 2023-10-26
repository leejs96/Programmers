import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        
        int len = list.size();
        int[] answer = new int[len];
        
        for(int j=0; j < len; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}
