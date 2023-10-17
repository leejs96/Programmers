import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < len; i++) {
            int number = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(number > k) {
                list.add(number);
            }
        }

        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}
