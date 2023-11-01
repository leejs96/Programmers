class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min_side = Math.min(sides[0], sides[1]);
        int max_side = Math.max(sides[0], sides[1]);
        
        for(int i = max_side - min_side; i < max_side; i++) {
            answer++;
        }
        
        for(int i = max_side + 1; i < max_side + min_side; i++) {
            answer++;
        }
        
        return answer;
    }
}
