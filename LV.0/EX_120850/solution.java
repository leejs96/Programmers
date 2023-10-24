import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            int c = my_string.charAt(i);
            if(c >= 48 && c <= 57) {
                list.add(c - 48);
            }
        }

        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}
