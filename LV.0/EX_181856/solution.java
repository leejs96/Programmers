class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        answer = Integer.compare(len1, len2);
        if(answer == 0) {
            int sum1 = 0;
            int sum2 = 0;
            
            for(int i : arr1) {
                sum1 += i;
            }
            
            for(int i : arr2) {
                sum2 += i;
            }
            answer = Integer.compare(sum1, sum2);
        }
        
        return answer;
    }
}
