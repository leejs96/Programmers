class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        
        String[] answer = new String[len];
        
        for(int i=0; i < len; i++) {
            int result = 0;
            String[] str = quiz[i].split(" ");
            
            if(str[1].equals("-")) {
                result = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                answer[i] = result == Integer.parseInt(str[4]) ? "O" : "X";
            } else {
                result = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                answer[i] = result == Integer.parseInt(str[4]) ? "O" : "X";
            }
        }
        
        return answer;
    }
}
