import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        
        for(String str : myString.split("x")) {
            if(!str.isEmpty()) {
                list.add(str);
            }
        }
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}
