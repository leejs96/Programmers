class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            // if (our_score[i] == score_list[i]) { [디버깅 문제]오류 부분
            if (our_score[i] == score_list[numbers[i]-1]) { // 수정 부분
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
