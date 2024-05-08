import java.util.HashMap;
import java.util.Collection;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothCnt = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            clothCnt.put(clothes[i][1], clothCnt.getOrDefault(clothes[i][1], 0) + 1);
        }

        Collection<Integer> values = clothCnt.values();
        for(int val : values) {
            answer *= val + 1;
        }

        return answer - 1;
    }
}
