public int solution(int balls, int share) {
    int answer = 0;
    double sec = 1;
    long num = 0;
    num = share > balls-share ? share : balls-share;
    if(balls-num == 0) {
        answer = 1;
    } else {
        for(double i = balls; i > num; i--) {
            sec = sec * i / (i - num);
        }
    }
    answer = (int)Math.round(sec);
    return answer;
}
