import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> skipList = new ArrayList<>();

        for(char c : skip.toCharArray()) {
            skipList.add(c);
        }

        for(char c : s.toCharArray()) {
            int idx = 0;

            while(idx != index) {
                c = c == 'z' ? 'a' : (char)(c+1);
                if(!skipList.contains(c)) {
                    idx++;
                }
            }
            answer += c + "";
        }
        return answer;
    }
}



// 2.
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
    
        for(char c : s.toCharArray()) {
            int idx = 0;
            
            while(idx != index) {
                c = c == 'z' ? 'a' : (char)(c+1);
                
                if(!skip.contains(String.valueOf(c))) {
                    idx++;
                }
            }
            answer += c + "";
        }
        return answer;
    }
}
