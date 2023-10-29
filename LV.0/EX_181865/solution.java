class Solution {
    public int solution(String binomial) {
        String[] bi = binomial.split(" ");
        
        int a = Integer.parseInt(bi[0]);
        int b = Integer.parseInt(bi[2]);
        int answer = 0;
        
        if(bi[1].equals("+")) {
            answer = a + b;
        } else if(bi[1].equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        
        return answer;
    }
}
