class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling) {
            for(String s : can) {
                if(word.indexOf(s.repeat(2)) == -1) {
                    word = word.replaceAll(s, "1");
                }
            }
            word = word.replaceAll("1", "");
            if(word.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
