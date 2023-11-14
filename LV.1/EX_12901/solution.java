import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayofweek = date.getDayOfWeek();
        int day = dayofweek.getValue();
        
        switch(day) {
            case 1 : return "MON";
            case 2 : return "TUE";
            case 3 : return "WED";
            case 4 : return "THU";
            case 5 : return "FRI";
            case 6 : return "SAT";
            default : return "SUN";
        }
    }
}
