class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        
        int len = str.length;
        int[] answer = new int[len];
        
        for(int i=0; i < len; i++) {
            answer[i] = str[i].length();
        }
        return answer;
    }
}
