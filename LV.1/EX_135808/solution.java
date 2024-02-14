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


// 다른 사람 풀이 중 깔끔하고 단순 풀이 (시간 측면에서도 윗 풀이보다 빨랐다!)
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length; i >= m; i -= m) {
            answer += score[i-m] * m;
        }
        
        return answer;
    }
}
