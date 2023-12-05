class Solution {
    public int[] solution(long n) {
        int len = Long.toString(n).length();
        int cnt = 0;
        
        int[] answer = new int[len];
        
        while(n != 0) {
            answer[cnt++] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}

// ArrayList 사용
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n != 0) {
            list.add((int)(n % 10));
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
