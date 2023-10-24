public int[] solution(int[] numbers, String direction) {
    int len = numbers.length;
    int[] answer = new int[len];
    if(direction.equals("right")) {
        for(int i = 0; i < len; i++) {
            int idx = i-1 == -1 ? len-1 : i-1;
            answer[i] = numbers[idx];
        }
    } else {
        for(int i = 0; i < len; i++) {
            int idx = i+1 == len ? 0 : i+1;
            answer[i] = numbers[idx];
        }
    }
    return answer;
}
