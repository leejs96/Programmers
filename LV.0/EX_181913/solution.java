public String solution(String my_string, int[][] queries) {
    String answer = "";
    StringBuffer strBuff = new StringBuffer(my_string);
    for(int i = 0; i < queries.length; i++) {
        String str = strBuff.substring(queries[i][0], queries[i][1]+1);
        String reverse = reverse(str);
        strBuff.replace(queries[i][0], queries[i][1]+1, reverse);

    }

    return answer = strBuff.toString();
}

String reverse(String str) {
    String result = "";
    for(int i = str.length()-1; i >= 0; i--) {
        result += str.charAt(i);
    }
    return result;
}
