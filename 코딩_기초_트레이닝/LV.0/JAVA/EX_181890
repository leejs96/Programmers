class Solution {
    public String[] solution(String[] str_list) {
        int len = str_list.length;
        String[] answer = {};

        for(int i = 0; i < len; i++) {
            if(str_list[i].equals("l")) {
                if(i != 0) {
                    answer = new String[i];
                    for(int j = 0; j < i; j++) {
                        answer[j] = str_list[j];
                    }
                    return answer;
                }
                return answer;

            } else if(str_list[i].equals("r")) {
                if(i != len-1) {
                    int idx = 0;
                    answer = new String[len-i-1];
                    for(int j = i+1; j < len; j++) {
                        answer[idx++] = str_list[j];
                    }
                    return answer;
                }
                return answer;
            }
        }
        return answer;
    }
}
