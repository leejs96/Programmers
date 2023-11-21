import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr) {
            if(stack.empty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = stack.size()-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
