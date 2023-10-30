import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i < arr.length; i++) {
            int a = arr[i];
            if(flag[i]) {
                for(int j=0; j < a*2; j++) {
                    list.add(a);
                }
            } else {
                for(int k = 0; k < arr[i]; k++) {
                    list.remove(list.size()-1);
                }
            }
        }
        
        answer = new int[list.size()];
        for(int x = 0; x < list.size(); x++) {
            answer[x] = list.get(x);
        }
        
        return answer;
    }
}
