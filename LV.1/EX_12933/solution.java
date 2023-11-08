class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        int len = s.length();
        long[] arr = new long[len];
        long answer = 0;

        // 배열에 담기
        for(int i = 0; i < len; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        // 정렬
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(arr[j] > arr[i]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // long 형식으로 변환
        for(int i = 0; i < len; i++) {
            answer += arr[i] * Math.pow(10, i);
        }
        
        return answer;
    }
}
