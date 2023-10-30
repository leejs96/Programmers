import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            int size = stk.size();
            if(size != 0) {
                if(stk.get(size-1) == arr[i]) {
                    stk.remove(size-1);
                } else {
                    stk.add(arr[i]);
                }
            } else {
                stk.add(arr[i]);
            }
            i++;
        }
        
        int[] answer = {};
        int len = stk.size();
        
        if(len != 0) {
            answer = new int[len];
            for(int j=0; j < len; j++) {
                answer[j] = stk.get(j);
            }
            return answer;
        }
        
        return answer = new int[]{-1};
    }
}
