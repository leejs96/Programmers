class Solution {
    public int solution(int[] common) {
        int len = common.length;
        int d = common[1] - common[0];
        int d2 = common[2] - common[1];
        
        if(d == d2) {
            return common[len-1] + d;
        } else {
            return common[len-1] * (common[1] / common[0]);
        }
    }
}
