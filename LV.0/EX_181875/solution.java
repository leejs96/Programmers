class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        
        String[] answer = new String[len];
        for(int i=0; i < len; i++) {
            answer[i] = i%2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return answer;
    }
}
