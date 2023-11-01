class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int start = len % 2 == 0 ? 1 : 0;
            
        for(int i = start; i < len; i += 2) {
            arr[i] = arr[i] + n;
        }
        
        return arr;
    }
}
