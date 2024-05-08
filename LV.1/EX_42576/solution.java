import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> completions = new HashMap<>();
        String result = "";
        
        for(String name : completion) {
            if(!completions.containsKey(name)) {
                completions.put(name, 1);
            } else {
                completions.replace(name, completions.get(name) + 1);
            }
        }
        
        for(String part : participant) {
            if(completions.containsKey(part) && completions.get(part) != 0) {
                completions.replace(part, completions.get(part) - 1);
            } else {
                result = part;
                break;
            }
        }
        
        return result;
    }
}
