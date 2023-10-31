import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i < numbers.length - 1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] * numbers[j]);
            }
        }
        
        return Collections.max(list);
    }
}


// 정렬 이용
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int f_max = numbers[0] * numbers[1];
        int e_max = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        int answer = Math.max(f_max, e_max);
        return answer;
    }
}
