class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        long target = Long.parseLong(p);
        int answer = 0;
        
        for(int i = 0; i <= t.length()-pLen; i++) {
            if(Long.parseLong(t.substring(i, i + pLen)) <= target) {
                answer++;
            }
        }
        
        return answer;
    }
}
