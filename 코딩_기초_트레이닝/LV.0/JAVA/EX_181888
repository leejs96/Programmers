class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int size = len % n == 0 ? len/n : len/n + 1;
        int idx = 0;
        
        int[] answer = new int[size];
        
        for(int i = 0; i < len; i += n) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}
