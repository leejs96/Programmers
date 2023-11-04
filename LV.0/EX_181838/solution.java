class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0] != date2[0]) { 
            return date1[0] < date2[0] ? 1 : 0;
        } else if(date1[1] != date2[1]) {
            return date1[1] < date2[1] ? 1 : 0;
        }
        
        return date1[2] < date2[2] ? 1 : 0;
    }
}


// LocalDate 사용
import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return dateA.isBefore(dateB) ? 1 : 0;
    }
}
