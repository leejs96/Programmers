class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (char c : myString.toCharArray()) {
          answer += c < 'l' ? 'l' : c;
        }
        
        return answer;
    }
}


// 정규식 사용
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[a-k]", "l");
    }
}
