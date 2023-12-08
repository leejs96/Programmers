class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(' ');
                cnt = 0;
            } else {
                if(cnt % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                cnt++;
            }
        }
        
        return sb.toString();
    }
}
