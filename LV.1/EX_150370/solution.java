import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> term = new HashMap<>();
        
        int privaciesLen = privacies.length;
        
        int[] privaciesYear = new int[privaciesLen];
        int[] privaciesMonth = new int[privaciesLen];
        int[] privaciesDay = new int[privaciesLen];
        
        String[] todaySplit = today.split("\\.");
        int[] todayArr = new int[3];
        
        for(int i = 0; i < 3; i++) {
            todayArr[i] = Integer.parseInt(todaySplit[i]);
        }
        
        for(String s : terms) {
            String[] termSplit = s.split(" ");
            term.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }
        
        for(int i = 0; i < privaciesLen; i++) {
            String[] privacySplit = privacies[i].split(" ");
            String[] date = privacySplit[0].split("\\.");
            
            int period = term.get(privacySplit[1]);
            int month = Integer.parseInt(date[1]);
            
            int sum = period + month;
            
            if(sum > 12) {
                if(sum % 12 == 0) {
                    privaciesMonth[i] = 12;
                    privaciesYear[i] = Integer.parseInt(date[0]) + (sum / 12) - 1;
                } else {
                    privaciesMonth[i] = sum % 12;
                    privaciesYear[i] = Integer.parseInt(date[0]) + (sum / 12);
                }
            } else {
                privaciesMonth[i] = sum;
                privaciesYear[i] = Integer.parseInt(date[0]);
            }
            
            privaciesDay[i] = Integer.parseInt(date[2]);
        }
       
        for(int i = 0; i < privaciesLen; i++) {
            System.out.println(privaciesYear[i] + "." + privaciesMonth[i] + "." + privaciesDay[i]);
            if(privaciesYear[i] == todayArr[0]) {
                if(privaciesMonth[i] == todayArr[1]) {
                    if(privaciesDay[i] <= todayArr[2]) {
                        list.add(i);
                    }
                } else if(privaciesMonth[i] < todayArr[1]) {
                    list.add(i);
                }
            } else if(privaciesYear[i] < todayArr[0]) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i) + 1;
        }
        
        return answer;
    }
}
