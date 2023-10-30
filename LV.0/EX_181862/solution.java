import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList();
        String[] myStr_a = myStr.split("a");

        for(String str : myStr_a){
            String[] myStr_b = str.split("b");

            for(String str2 : myStr_b){
                String[] myStr_c = str2.split("c");

                for(int i=0; i<myStr_c.length; i++){
                    if(!myStr_c[i].equals("")){
                         list.add(myStr_c[i]);
                    }
                }
            }
        }

        String answer[] = new String[1];

        if(list.size() != 0){
            answer = new String[list.size()];
            for(int i=0;i<list.size(); i++){
                answer[i] = list.get(i);
            }

        } else {
            answer[0] = "EMPTY";
        }

        return answer;
    }
}
