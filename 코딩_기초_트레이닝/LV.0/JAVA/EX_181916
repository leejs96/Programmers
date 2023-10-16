import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : dice) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.replace(i, map.get(i) + 1);
            }
        }
        
        int count = map.size();
        if(count == 1) {
            answer = 1111 * a;
            
        } else if(count == 4) {
            answer = Collections.min(map.keySet());
            
        } else if(count == 3) {
            answer = 1;
            for(int key : map.keySet()) {
                if(map.get(key) == 1) {
                    answer *= key;
                }
            }
            
        } else {
            List<Integer> val = new ArrayList<>(map.values());
            if(val.contains(2)) {
                int p = dice[0];
                int q = 0;
                if(p != dice[1]) {
                    q = dice[1];
                } else {
                    q = dice[2];
                }
                answer = (p + q) * Math.abs(p-q);
            } else {
                int p = 0;
                int q = 0;
                for(int key : map.keySet()) {
                    if(map.get(key) == 3) {
                        p = key;
                    } else {
                        q = key;
                    }
                }
                answer = (10 * p + q) * (10 * p + q);
            }
        }
        
        return answer;
    }
}
