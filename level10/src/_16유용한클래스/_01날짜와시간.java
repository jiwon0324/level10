package _16유용한클래스;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01날짜와시간 {

	public static void main(String[] args) {
	 
	    System.out.println(System.currentTimeMillis());
	    
	    LocalDate tody=LocalDate.now();
	    System.out.println(tody);
	    
	    LocalTime nowTime=LocalTime.now();
	    System.out.println(nowTime);
	    
	    System.out.println(Clock.systemDefaultZone());
	    
	    LocalDate tomrrow=tody.plusDays(100);
	    System.out.println(tomrrow);
	    
	    LocalDate tempdate=tody.minusYears(10);
	    System.out.println(tempdate);
	    
	    //두 날짜 사이 간격
	    LocalDate test1=LocalDate.of(2030, 5, 3);
	    Period test2=Period.between(test1, tody);
	    System.out.printf("%d년 %d월 %d일\n",test2.getYears(),test2.getMonths(),test2.getDays());
	    
	    Duration test3=Duration.between(LocalDateTime.of(2025,01,22,13,12), LocalDateTime.of(2025,01,23,13,12));
	    
	    System.out.println(test3);
	    System.out.println(test3.toDays());
	    System.out.println(test3.toHours());
	    System.out.println(test3.toMinutes());
	    
	    //날짜 원하는 스트링 값으로 환산
	    
	    DateTimeFormatter sdf1=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
	    LocalDateTime today2=LocalDateTime.now();
	    System.out.println(today2);
	    System.out.println(today2.format(sdf1));
	    
	    DateTimeFormatter sdf2=DateTimeFormatter.ofPattern("yy년 MMM월 dd일 E요일 a HH: mm :ss ");
	    System.out.println(today2.format(sdf2));
	    
	    
	    //string ->날짜객체
	    String nowData="2025-01-22";
	    DateTimeFormatter sdf3=DateTimeFormatter.ofPattern("yyyy-MM-dd ");
	    LocalDate time=LocalDate.parse(nowData,sdf3);
	    System.out.println(time);
	}

}
