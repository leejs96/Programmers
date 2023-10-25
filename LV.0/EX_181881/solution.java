class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int len = arr.length;

        int[] temp = new int[len];

        while(cnt != len) {
            cnt = 0;
            answer++;

            for(int i=0; i < len; i++) {
                if(arr[i] >= 50 && arr[i]%2 == 0) {
                    temp[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i]%2 != 0) {
                    temp[i] = (arr[i] * 2) + 1;
                } else {
                    temp[i] = arr[i];
                }

                if(temp[i] == arr[i]) cnt++;
            }

            for(int j=0; j < len; j++) {
                arr[j] = temp[j];
            }

        }

        return answer - 1;
    }
}
