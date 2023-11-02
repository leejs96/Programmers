class Solution {
    public int solution(int n) {
        int answer = 0;
        int a =0;
        
        while(a < n) {
        	a++;
            answer++;
            
            while(answer % 3 == 0 || Integer.toString(answer).indexOf("3") != -1) {
                answer++;
            }
        }
        
        return answer;
    }
}
