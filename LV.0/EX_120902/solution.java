class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean plus = true;
        String[] str = my_string.split(" ");
      
        for(String s : str) {
            if(s.equals("+")) {
                plus = true;
            } else if(s.equals("-")) {
                plus = false;
            } else {
                int num = Integer.parseInt(s);
                answer = plus ? answer + num : answer - num;
            }
        }
        
        return answer;
    }
}
