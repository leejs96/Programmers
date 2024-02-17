class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] cntList = new int[number];

        for(int i = 1; i <= number; i++) {
            cntList[i-1] = divisorCnt(i);
        }

        for(int i = 0; i < number; i++) {
            if(cntList[i] <= limit) {
                answer += cntList[i];
            } else {
                answer += power;
            }
        }

        return answer;
    }

    public int divisorCnt(int num) {
        int cnt = 0;
        int sqrt = (int) Math.sqrt(num);

        for(int i = 1; i <= sqrt; i++) {
            if(num % i == 0) {
                cnt++;
                if(num / i != i) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
