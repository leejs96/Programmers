class Solution {
    public int solution(int a, int b) {
        int min = Math.min(a, b);
        
        while(min > 0) {
            if(a % min == 0 && b % min == 0) {
                a /= min;
                b /= min;
            }
            min--;
        }
        
        while(b % 2 == 0 || b % 5 == 0) {
            b /= b % 5 == 0 ? 5 : 2;
        }
        
        return b == 1 ? 1 : 2;
    }
}
