import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(!list.contains(c)) {
                list.add(c);
            }

        }

        for(int j = 0; j < list.size(); j++) {
            answer += list.get(j);
        }

        return answer;
    }
}
