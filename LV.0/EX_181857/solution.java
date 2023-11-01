import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while(len < arr.length) {
            len *= 2;
        }
        return Arrays.copyOf(arr, len);
    }
}


// 2진수 방법
class Solution {
    public int[] solution(int[] arr) {
        String binary = Integer.toBinaryString(arr.length);
        
        if(binary.indexOf("1") != binary.lastIndexOf("1")) {
        	binary = binary.replaceAll("1", "0");
        	binary = "1" + binary;
            
            int[] answer = new int[Integer.valueOf(binary, 2)];
            for(int i=0; i < answer.length; i++) {
                answer[i] = i < arr.length ? arr[i] : 0;
            }
            return answer;
            
        } else {
            return arr;
        }

    }
}
