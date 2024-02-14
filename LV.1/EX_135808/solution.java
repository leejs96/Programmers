import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = score.length;

        List<Integer> scoreList = new ArrayList<>();

        for(int s : score) {
            scoreList.add(s);
        }

        Collections.sort(scoreList);

        int idx = count - m;

        while(count >= m) {
            int minPrice = scoreList.get(idx);
            idx -= m;
            count -= m;

            answer += minPrice * m;
        }


        return answer;
    }
}
