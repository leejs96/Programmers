class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        
        for(String word : goal) {
            if(idx1 < cards1.length && word.equals(cards1[idx1])) {
                idx1++;
            } else if(idx2 < cards2.length && word.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}

// ArrayList 사용
import java.util.ArrayList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for(String card : cards1) {
            list1.add(card);
        }
        for(String card : cards2) {
            list2.add(card);
        }

        for(String word : goal) {
            if(list1.size() > 0 && word.equals(list1.get(0))) {
                list1.remove(0);
            } else if(list2.size() > 0 && word.equals(list2.get(0))) {
                list2.remove(0);
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
