class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String type = "RTCFJMAN";
        int[] score = new int[8];

        for(int i = 0; i< survey.length; i++) {
            int disIdx = type.indexOf(survey[i].charAt(0));
            int agrIdx = type.indexOf(survey[i].charAt(1));

            switch(choices[i]) {
                case 4: break;
                case 1: score[disIdx] += 3; break;
                case 2: score[disIdx] += 2; break;
                case 3: score[disIdx] += 1; break;
                case 5: score[agrIdx] += 1; break;
                case 6: score[agrIdx] += 2; break;
                case 7: score[agrIdx] += 3; break;
            }
        }

        for(int i = 0; i < score.length; i += 2) {
            answer += score[i] >= score[i+1] ? type.charAt(i) : type.charAt(i+1);
        }

        return answer;
    }
}

// HashMap 사용
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : type) {
            map.put(c, 0);
        }
        
        for(int i = 0; i< survey.length; i++) {
            char dis = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            switch(choices[i]) {
                case 4: break;
                case 1: map.put(dis, map.get(dis) + 3); break;
                case 2: map.put(dis, map.get(dis) + 2); break;
                case 3: map.put(dis, map.get(dis) + 1); break;
                case 5: map.put(agree, map.get(agree) + 1); break;
                case 6: map.put(agree, map.get(agree) + 2); break;
                case 7: map.put(agree, map.get(agree) + 3); break;
            }
        }
    
        for(int i = 0; i < type.length; i += 2) {
            answer += map.get(type[i]) >= map.get(type[i+1]) ? type[i] : type[i+1];
        }
        
        return answer;
    }
}
