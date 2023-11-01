class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-z]", " ");
        int answer = 0;
        
        for(String s : my_string.split(" ")) {
        	answer += s.equals("") ? 0 : Integer.parseInt(s);
        }
        return answer;
    }
}
