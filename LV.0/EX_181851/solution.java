import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        
        int[] top = new int[3];
        
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < rank.length; j++) {
        		if(list.get(i) == rank[j]) {
        			top[i] = j;
        		}
        	}
        }
        
        return 10000 * top[0] + 100 * top[1] + top[2];
    }
}
