class Solution {
    public int[] solution(int[] arr, int k) {
        int len = arr.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = k % 2 != 0 ? arr[i] * k : arr[i] + k;
        }
        
        return answer;
    }
}
