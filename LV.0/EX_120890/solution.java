import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int abs = Math.abs(array[0] - n);
        int temp = array[0];

        for(int i = 1; i < array.length; i++) {
            if(abs > Math.abs(array[i] - n)) {
                abs = Math.abs(array[i] - n);
                temp = array[i];

            } else if(abs == Math.abs(array[i] - n)) {
                temp = temp < array[i] ? temp : array[i];
            }
        }

        answer = temp;
        return answer;
    }
}
