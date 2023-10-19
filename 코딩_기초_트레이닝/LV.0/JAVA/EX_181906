public int solution(String my_string, String is_prefix) {
    int answer = 0;
    int len = is_prefix.length();

    if(len > my_string.length()) {
        answer = 0;
    } else {
        String prefix = my_string.substring(0, len);
        if(prefix.equals(is_prefix)) answer = 1;    
    }

    return answer;
}

// 더 간단하게
public int solution(String my_string, String is_prefix) {
    int answer = 0;
    answer = my_string.indexOf(is_prefix) == 0 ? 1 : 0;
    return answer;
}
