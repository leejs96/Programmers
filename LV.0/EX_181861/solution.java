import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            for(int j=1; j <= i; j++) {
                list.add(i);
            }
        }
        
        int len = list.size();
        int[] answer = new int[len];
        
        for(int l = 0; l < len; l++) {
            answer[l] = list.get(l);
        }
        
        return answer;
    }
}
