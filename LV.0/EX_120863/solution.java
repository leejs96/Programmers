class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" \\+ ");
        
        int a = 0;
        int c = 0;
        
        for(String s : str) {
           if(s.endsWith("x")) {
               if(s.equals("x")) {
                   a += 1;
               } else {
                   a += Integer.parseInt(s.substring(0, s.length()-1));
               }
           } else {
               c += Integer.parseInt(s);
           }
        }
        
        if(a != 0) {
            if(a != 1) {
                answer += a + "x";
            } else {
                answer += "x";
            }
        }
        
        if(c != 0) {
            if(a != 0) {
                answer += " + " + c;
            } else {
                answer += Integer.toString(c);
            }
        }
        
        return answer;
    }
}
