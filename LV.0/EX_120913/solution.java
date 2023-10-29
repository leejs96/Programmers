class Solution {
    public String[] solution(String my_str, int n) {
        int size = (int)Math.ceil((double)my_str.length()/n);
        
        String[] answer = new String[size];
        for(int i = 0; i < size; i++) {
            int start = i*n;
            
            if(i == size-1) {
                answer[i] = my_str.substring(start);
            } else {
                answer[i] = my_str.substring(start, start+n);    
            }
        }
        
        return answer;
    }
}
