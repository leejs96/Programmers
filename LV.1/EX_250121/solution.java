import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int len = data.length;
        
        ArrayList<int[]> list = new ArrayList<>();
        
        HashMap<String, Integer> index_map = new HashMap<>();
        index_map.put("code", 0);
        index_map.put("date",1 );
        index_map.put("maximum", 2);
        index_map.put("remain", 3);
        
        int ext_index = index_map.get(ext);
        final int sort_index = index_map.get(sort_by);
        
        for(int i = 0; i < len; i++) {
            if(data[i][ext_index] < val_ext) {
                list.add(data[i]);
            }
        }
        
        Collections.sort(list, (o1,o2) -> o1[sort_index] - o2[sort_index]);
        
        int[][] answer = list.toArray(new int[list.size()][4]);
        return answer;
    }
}
