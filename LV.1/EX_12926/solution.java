class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                answer += " "; 
            } else if(Character.isUpperCase(c)) {
                answer += Character.toString(upperPlusWord(c, n));
            } else {
                answer += Character.toString(lowerPlusWord(c, n));
            }
        }
        return answer;
    }
    
    char upperPlusWord(char c, int n) {
        return c + n > 90 ? (char)(c + n - 26) : (char)(c + n);
    }
    
    char lowerPlusWord(char c, int n) {
        return c + n > 122 ? (char)(c + n - 26) : (char)(c + n);
    }
}
