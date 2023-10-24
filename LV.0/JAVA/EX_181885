class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = todo_list.length;
        int size = 0;
        int idx = 0;
        
        for(int i = 0; i < len; i++) {
            if(!finished[i]) size++;
        }
        
        String[] answer = new String[size];
        
        for(int j = 0 ; j < todo_list.length; j++) {
            if(!finished[j]) {
                answer[idx++] = todo_list[j]; 
            }
        }
        return answer;
    }
}
