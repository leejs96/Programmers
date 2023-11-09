class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;

        if(len == 1) {
            answer = new int[] {-1};
        } else {
            int min = arr[0];
            
            for(int i = 1; i < len; i++) {
                min = min < arr[i] ? min : arr[i];
            }
            
            answer = new int[len-1];
            int idx = 0;
            
            for(int i : arr) {
                if(i != min) {
                    answer[idx++] = i;
                }
            }
        }
        
        return answer;
    }
