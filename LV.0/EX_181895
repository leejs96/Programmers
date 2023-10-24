import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            } 
        }

        int len = list.size();
        System.out.println(len);
        int[] answer  = new int[len];

        for(int j = 0; j < len; j++) {
            answer[j] = list.get(j);
            System.out.print(answer[j]);
        }

        return answer;
    }
}
