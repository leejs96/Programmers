import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        int len = arr.length;
        int[] answer = new int[len];
        
        for(int j = 0; j < len; j++) {
            answer[j] = arr[j];
        }
        return answer;
    }
}
