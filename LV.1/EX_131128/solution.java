class Solution {
    public String solution(String X, String Y) {
        StringBuilder result = new StringBuilder();
        
        int[] numX = new int[10];
        int[] numY = new int[10];
        
        for(String s : X.split("")) {
            numX[Integer.parseInt(s)]++;
        }
        
        for(String s : Y.split("")) {
            numY[Integer.parseInt(s)]++;
        }
        
        for(int i = 9; i > 0; i--) {
            int cnt = numX[i] > numY[i] ? numY[i] : numX[i];
            result.append(Integer.toString(i).repeat(cnt));
        }
        
        if(result.length() == 0) {
            return numX[0] > 0 && numY[0] > 0 ? "0" : "-1";
        } else {
            int zero = numX[0] > numY[0] ? numY[0] : numX[0];
            result.append("0".repeat(zero));
        }
        
        return result.toString();
    }
}
