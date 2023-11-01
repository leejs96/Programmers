class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

		for(String word : dic) {
			int count = 0;
			
			for(String s : spell) {
				if(!word.contains(s)) {
					count--;
				}
			}
			
			answer += count < 0 ? 0 : 1;
		}
		
        return answer == 0 ? 2 : answer;
    }
}
