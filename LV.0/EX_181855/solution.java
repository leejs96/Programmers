import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String s : strArr) {
        	int len = s.length();
        	
        	if(map.containsKey(len)) {
        		map.put(len, map.get(len)+1);
        	} else {
        		map.put(len, 1);
        	}
    	}
        
        return Collections.max(map.values());
    }
}
