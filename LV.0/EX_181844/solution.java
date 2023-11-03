import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> dList = new ArrayList<>(delete_list.length);

        for(int i : delete_list) {
            dList.add(i);
        }

        for(int i : arr) {
            if(!dList.contains(i)) {
                newList.add(i);
                System.out.print(i + " ");
            }
        }

        int len = newList.size();
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = newList.get(i);
        }
        return answer;
    }
}


// List의 remove메소드 사용
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> newList = new ArrayList<>();
        
        for(int i : arr) {
            newList.add(i);
        }
        
        for(int i : delete_list) {
            newList.remove((Integer) i);
        }
        
        int len = newList.size();
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = newList.get(i);
        }
        return answer;
    }
}
