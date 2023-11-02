class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            for(String s : word) {
                babbling[i] = babbling[i].replaceAll(s, " ");
            }

            if(babbling[i].isBlank()) {
                answer++;
            }
        }

        return answer;
    }
}
