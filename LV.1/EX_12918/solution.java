import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        int len = s.length();
        return len == 4 || len == 6 ? Pattern.matches("^[0-9]*$", s) : false;
    }
}


// try-catch문 이용
import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        int len = s.length();
		
		if(len == 4 || len == 6) {
            try {
            	return Pattern.matches("^[0-9]*$", s);
            } catch(NumberFormatException e) {
            	return false;
            }
        }
        return false;
    }
}
