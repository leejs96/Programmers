class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        int size = len % 5 == 0 ? len/5 : len/5 + 1;
        int idx = 0;
        
        String[] answer = new String[size];
        
        for(int i = 0; i < len; i += 5) {
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}
