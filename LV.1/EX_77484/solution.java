class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int len = lottos.length;
        int zero = 0;
        int match = 0;

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(lottos[i] == 0) {
                    zero++;
                    break;
                } else if(lottos[i] == win_nums[j]) {
                    match++;
                }
            }
        }

        switch(match) {
            case 6: answer[1] = 1; break;
            case 5: answer[1] = 2; break;
            case 4: answer[1] = 3; break;
            case 3: answer[1] = 4; break;
            case 2: answer[1] = 5; break;
            default: answer[1] = 6; break; 
        }

        answer[0] = zero == 6 ? answer[1] - zero + 1 : answer[1] - zero;

        return answer;
    }
}

// HashSet 사용 (더 효율적이고 깔끔)
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero = 0;
        int match = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int win : win_nums) {
            set.add(win);
        }
        
        for(int lotto : lottos) {
            if(lotto == 0) {
                zero++;
            } else if(set.contains(lotto)) {
                match++;
            }
        }
        
        switch(match) {
            case 6: answer[1] = 1; break;
            case 5: answer[1] = 2; break;
            case 4: answer[1] = 3; break;
            case 3: answer[1] = 4; break;
            case 2: answer[1] = 5; break;
            default: answer[1] = 6; break; 
        }
        
        answer[0] = zero == 6 ? answer[1] - zero + 1 : answer[1] - zero;
        
        return answer;
    }
}
