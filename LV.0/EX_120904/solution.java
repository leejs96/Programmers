class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = Integer.toString(num);
        answer = str.indexOf(Integer.toString(k));
        answer = answer == -1 ? answer : answer + 1;
        
        return answer;
    }
}
