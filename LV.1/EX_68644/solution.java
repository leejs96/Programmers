import java.util.TreeSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < len-1; i++) {
            for(int j = 1; j < len; j++) {
                if(i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        Iterator<Integer> it = set.iterator();
        
        int[] answer = new int[set.size()];
        int idx = 0;
        
        while(it.hasNext()) {
            answer[idx++] = it.next();
        }
        
        return answer;
    }
}
