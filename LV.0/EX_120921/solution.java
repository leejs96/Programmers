class Solution {
    public int solution(String A, String B) {
        for(int i = 0; i < A.length(); i++) {
        	String temp = "";
        	
          if(A.equals(B)) {
              return i;
          } else {
              A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
          }
        }
        return -1;
    }
}

// 2.
class Solution {
    public int solution(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}
