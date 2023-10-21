import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> list = new ArrayList<>();

        switch(n) {
            case 1: answer = Arrays.copyOfRange(num_list, 0, b+1); break;
            case 2: answer = Arrays.copyOfRange(num_list, a, num_list.length); break;
            case 3: answer = Arrays.copyOfRange(num_list, a, b+1); break;
            case 4:
                int idx = 0;

                for(int i = a; i <= b; i += c) {
                    list.add(num_list[i]);
                }

                int len = list.size();
                answer = new int[len];
                for(int j = 0; j < len; j++) {
                    answer[j] = list.get(j);
                }
        }

        return answer;
    }
}
