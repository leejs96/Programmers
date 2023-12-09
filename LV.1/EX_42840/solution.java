import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] firstAns = {1, 2, 3, 4, 5};
        int[] secondAns = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdAns = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == firstAns[i%5]) {
                result1++;
            }
            if(answers[i] == secondAns[i%8]) {
                result2++;
            }
            if(answers[i] == thirdAns[i%10]) {
                result3++;
            }
        }
        
        int max = Math.max(result1, Math.max(result2, result3));
        ArrayList<Integer> list = new ArrayList<>();
        
        if(result1 == max) {
            list.add(1);
        }
        
        if(result2 == max) {
            list.add(2);
        }
        
        if(result3 == max) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
