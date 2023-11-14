class Solution {
    public int solution(int n) {
        
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        String sb_reverse = sb.reverse().toString();
        
        return Integer.parseInt(sb_reverse, 3);
    }
}
