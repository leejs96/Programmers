class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = "";
			for (char c : picture[i / k].toCharArray()) {
				for (int j = 0; j < k; j++) {
					answer[i] += c;
				}
			}
		}

		return answer;
    }
}
