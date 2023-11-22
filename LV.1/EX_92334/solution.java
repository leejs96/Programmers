import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        HashSet<String> report_dedup = new HashSet<>();
        
        ArrayList<String> result = new ArrayList<>();
        
        int[] answer = new int[id_list.length];
        int idx = 0;
        
        for(String s : report) { // 중복 신고 제거
            report_dedup.add(s);
        }
        
        Iterator it = report_dedup.iterator();
        
        while(it.hasNext()) { // 신고 횟수
            String s = it.next().toString();
            String name = s.substring(s.indexOf(" ") + 1);
            
            if(map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        
        for(String id : id_list) { // 정지되는 이용자 리스트
            if(map.get(id) != null && map.get(id) >= k) {
                result.add(id);
            }
        }
        
        for(int i = 0; i < id_list.length; i++) { // 결과 메일 받는 횟수 구하기
            for(int j = 0; j < result.size(); j++) {
                String s = id_list[i] + " " + result.get(j);
                if(report_dedup.contains(s)) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
