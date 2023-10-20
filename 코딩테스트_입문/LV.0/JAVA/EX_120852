import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int num = n;
        boolean deci = false;

        for(int i = 2; i <= n; i++) {
            while(num % i == 0) {
                num = num / i;
                deci = true;
            }
            if(deci) {
                list.add(i);
                deci = false;
            }

        }

        int len = list.size();
        int[] answer = new int[len];

        for(int j = 0; j < len; j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}
