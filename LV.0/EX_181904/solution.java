public String solution(String my_string, int m, int c) {
    int len = my_string.length();
    
    String answer = "";
    for(int i = c-1; i < len; i += m) {
        answer += my_string.charAt(i);
    }

    return answer;
}
