class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                answer += c;
            }
        }
        return answer;
    }
}


// 정규표현식 사용
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
