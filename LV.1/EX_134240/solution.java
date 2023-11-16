// 1.
class Solution {
    public String solution(int[] food) {
        String answer = "";        
        
        for(int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            if(cnt != 0) {
                answer += Integer.toString(i).repeat(cnt);
            }
        }
        
        StringBuffer sb = new StringBuffer(answer);
        sb.reverse();
        
        answer += "0" + sb.toString();
        
        return answer;
    }
}

// 2.
class Solution {
    public String solution(int[] food) {
        String answer = "0";        
        
        for(int i = food.length-1; i > 0; i--) {
            String s = Integer.toString(i).repeat(food[i]/2);
            answer = s + answer + s;
        }
        
        return answer;
    }
}
