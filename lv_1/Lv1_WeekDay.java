package codeTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

// 코테 Lv1 문제.. 특정 날짜의 요일 출력
public class Lv1_WeekDay {
	
	public String solution(int a, int b) {
        String answer = "";
        
        // 날짜 설정
        LocalDate date = LocalDate.of(2016, a, b);
        
        // 요일 가져오기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNum = dayOfWeek.getValue();
        
        if(dayOfWeekNum == 7){
            answer = "SUN";
        }else if(dayOfWeekNum == 1){
            answer = "MON";
        }else if(dayOfWeekNum == 2){
            answer = "TUE";
        }else if(dayOfWeekNum == 3){
            answer = "WED";
        }else if(dayOfWeekNum == 4){
            answer = "THU";
        }else if(dayOfWeekNum == 5){
            answer = "FRI";
        }else if(dayOfWeekNum == 6){
            answer = "SAT";
        }
        
        
        return answer;
    }

}
