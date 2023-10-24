class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        char temp1 = sb.charAt(num1);
        char temp2 = sb.charAt(num2);
        
        sb.setCharAt(num1, temp2);
        sb.setCharAt(num2, temp1);
        
        return answer = sb.toString();
    }
}
