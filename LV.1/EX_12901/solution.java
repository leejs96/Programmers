// 1. LocalDate & DayOfWeek 클래스 사용
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

// 2.
class Solution {
    public String solution(int a, int b) {
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        
        for(int i = 0; i < a-1; i++) {
            day += date[i];
        }
        
        day = (day + b) % 7;
        
        switch(day) {
            case 1 : return "FRI";
            case 2 : return "SAT";
            case 3 : return "SUN";
            case 4 : return "MON";
            case 5 : return "TUE";
            case 6 : return "WED";
            default: return "THU";
        }
        
    }
}
