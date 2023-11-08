class Solution {
    public int solution(int num) {
        long number = (long)num;
        int answer = 0;
        
        while(answer < 500) {
            if(number == 1) return answer;
            
            number = number % 2 == 0 ? number / 2 : number * 3 + 1;
            answer++;
        }
        
        return -1;
    }
}
