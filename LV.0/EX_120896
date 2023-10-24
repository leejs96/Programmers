import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        
        for(char c : s.toCharArray()) {
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                list.add(c);
            }
        }
        Collections.sort(list);
        
        for(char ch : list) {
            answer += ch;
        }
        
        return answer;
    }
}
