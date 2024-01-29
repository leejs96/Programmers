class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];        
        
        for(int i = 0; i < n; i++) {
            int sum = arr1[i] | arr2[i]; // 논리합
            
            String binary = Integer.toBinaryString(sum);
            binary = "0".repeat(n - binary.length()) + binary; // 모두 n자리수로 만들어주기 
            
            binary = binary.replaceAll("1", "#").replaceAll("0", " ");
            
            answer[i] = binary;
        }
        
        return answer;
    }
}
