import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i < strArr.length; i++) {
            String str = strArr[i];
            if(!str.contains("ad")) {
                list.add(str);
            }
        }
        
        int len = list.size();
        String[] answer = new String[len];
        
        for(int j=0; j < len; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}
