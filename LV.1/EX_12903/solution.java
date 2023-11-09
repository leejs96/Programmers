class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        int center = len / 2;
        
        answer += len % 2 == 0 ? s.substring(center - 1, center + 1) : s.charAt(center);
        return answer;
    }
}
