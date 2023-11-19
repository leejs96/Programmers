class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bonus = 0;
        
        while(n >= a) {
            bonus = (n / a) * b;
            answer += bonus;
            n = n % a + bonus;
        }
        
        return answer;
    }
}
