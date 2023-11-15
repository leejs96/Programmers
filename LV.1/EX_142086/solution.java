import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            
            if(!map.containsKey(c)) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(c);
            }
            
            map.put(c, i);
        }
        
        return answer;
    }
}
