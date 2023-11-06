import java.util.ArrayList;

class Solution {
    public int solution(String before, String after) {
        ArrayList<Character> beforeList = new ArrayList<>();
        
		for (char c : before.toCharArray()) {
			beforeList.add(c);
		}

		for (char c : after.toCharArray()) {
			if (!beforeList.contains(c)) {
				return 0;
			} else {
				beforeList.remove(beforeList.indexOf(c));
			}
		}
        
        return beforeList.size() == 0 ? 1 : 0;
    }
}


// 배열 순서 & String이 char배열을 이용해 만들어진 문자열인 것을 이용(다른 사람 풀이)
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
		    char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

		    return new String(beforeArr).equals(new String(afterArr)) ? 1 : 0;
    }
}
