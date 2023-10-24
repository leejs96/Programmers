class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = arr.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < queries.length; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j] += 1;
            }
        }
        
        answer = arr;
        return answer;
    }
}
