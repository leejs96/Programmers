class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char check = Character.forDigit(k, 10);

		for (int x = i; x <= j; x++) {
			String s = Integer.toString(x);

			for (char c : s.toCharArray()) {
				if (c == check) {
					answer++;
				}
			}
		}   
        
        return answer;
    }
}
