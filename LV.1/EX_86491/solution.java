class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int minWidth = 0;
        
        for(int[] size : sizes) {
            int maxSize = Math.max(size[0], size[1]);
            int minSize = Math.min(size[0], size[1]);
            
            maxWidth = Math.max(maxWidth, maxSize); // 제일 큰 변
            minWidth = Math.max(minWidth, minSize); // 작은 변들 중 큰 변
        }
        
        return maxWidth * minWidth;
    }
}
