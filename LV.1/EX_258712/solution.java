import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int giver = 0; // 선물 주는 사람 index
        int taker = 0; // 선물 받는 사람 index
        int len = friends.length;
        
        int[][] matrix = new int[len][len]; // 주고 받은 선물 표시하는 행렬
        int[] nextMonth = new int[len]; // 다음달에 받게 될 선물
        int[] giftIndex = new int[len]; // 선물지수
        
        String[] gift = new String[2];
        
        HashMap<String, Integer> friendIndex = new HashMap<>();
        
        for(int i = 0; i < len; i++) { // 각 이름에 맞는 인덱스 저장
            friendIndex.put(friends[i], i);
        }
    
        
        for(int i=0; i < gifts.length; i++) {
            gift = gifts[i].split(" ");
            giver = friendIndex.get(gift[0]);
            taker = friendIndex.get(gift[1]);
            
            matrix[giver][taker]++; // 주고 받은 선물
            
            // 선물 지수
            giftIndex[giver]++;
            giftIndex[taker]--;
        }
        
        for(int i = 0; i < len-1; i++) {
            for(int j=i+1; j < len; j++) {
                if(matrix[i][j] - matrix[j][i] > 0) {
                    nextMonth[i]++;
                } else if(matrix[i][j] - matrix[j][i] < 0) {
                    nextMonth[j]++;
                } else {
                    if(giftIndex[i] > giftIndex[j]) {
                        nextMonth[i]++;
                    } else if(giftIndex[i] < giftIndex[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        
        for(int cnt : nextMonth) {
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}
