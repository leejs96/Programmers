import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr) {
            if(num % divisor == 0) {
                list.add(num);
            }
        }
        
        if(list.isEmpty()) {
            answer = new int[] {-1};
        } else {
            Collections.sort(list);
            int len = list.size();
            
            answer = new int[len];
            for(int i = 0; i < len; i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}
