public String solution(String my_string, int s, int e) {
    String answer = "";
    if(s != e) {
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer part = new StringBuffer(sb.substring(s, e+1));
        part.reverse();
        sb.delete(s, e+1);
        sb.insert(s, part);
        answer = sb.toString();
    } else {
        answer = my_string;
    }
    
    return answer;
}
