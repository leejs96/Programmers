import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];

        for(int i = 0; i < len; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(answer);

        for(int i = 0; i < len; i++) {
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}
