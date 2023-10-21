import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            list.add(arr[i]);
        }

        int start = list.indexOf(2);
        if(start != -1) {
            int end = list.lastIndexOf(2);

            int[] answer = new int[end-start+1];
            for(int j = 0; j < end-start+1; j++) {
                answer[j] = arr[start + j];
            }
            return answer;

        } else {
            int[] answer = {-1};
            return answer;
        }

    }
}
