class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9\\-\\_\\.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        
        if(answer.length() != 0 && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if(answer.length() != 0 && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0, answer.length()-1);
        }
        
        if(answer.length() == 0) {
            answer = "a";
        }
        
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if(answer.charAt(14) == '.') {
                answer = answer.substring(0,14);
            }
        }
        
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}
