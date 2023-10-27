class Solution {
    public int solution(int n) {
        double result = Math.sqrt(n);
        int answer = result == (int)result ? 1 : 2;
        return answer;
    }
}


class Solution {
    public int solution(int n) {
        int answer = n % Math.sqrt(n) == 0 ? 1 : 2;
        return answer;
    }
}
