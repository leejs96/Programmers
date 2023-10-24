class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            int asc = my_string.charAt(i);

            if(asc >= 97) {
                answer[asc - 71] += 1;
            } else {
                answer[asc - 65] += 1;
            }
        }

        return answer;
    }
}
