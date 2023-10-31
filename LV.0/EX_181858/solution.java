import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        Set<Integer> set = new LinkedHashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        
        int[] answer = new int[k];
        var it = set.iterator();
        
        for(int i=0; i < k; i++) {
            answer[i] = it.hasNext() ? it.next() : -1;
        }
        
        return answer;
    }
}
