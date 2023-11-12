import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        int len = s.length();
        return len == 4 || len == 6 ? Pattern.matches("^[0-9]*$", s) : false;
    }
}
