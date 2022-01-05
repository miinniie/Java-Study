import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// 현재 시스템의 날짜, 시간에 관련된 정보를 객체로 구한다.
		// Calendar 클래스를 new로 객체를 생성할 수 없다.
		// 객체를 생성하여 리턴해주는 getInstance()메소드를 이용한다.
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		//날짜 또는 시간 변경하기
		//년월일
		now.set(2021,11,1);
//		//년월일시분
//		now.set(2020,5,25,13,50);
//		//년월일시분초
//		now.set(2023,4,10,10,20,30);
//		//년도만 변경
//		now.set(Calendar.YEAR,2022); //바로 위에 set method 기준
		
		String weekStr="";
		
		  int year  = now.get(Calendar.YEAR);
		  int month = now.get(Calendar.MONTH);//특이하게 월은 0월부터 시작, +1해서 출력해야됨
		  int day   = now.get(Calendar.DAY_OF_MONTH);
		  int week  = now.get(Calendar.DAY_OF_WEEK);
		  int hour  = now.get(Calendar.HOUR_OF_DAY);
		  int min   = now.get(Calendar.MINUTE);
//		  int sec   = now.get(Calendar.SECOND);
		  
//		  if (week==1) {
//			  weekStr = "일";
//		  }else if (week==2) {
//			  weekStr = "월";
//		  }else if (week==3) {
//			  weekStr = '화';
//		  }else if (week==4) {
//			  weekStr = "수";
//		  }else if (week==5) {
//			  weekStr = "목";
//		  }else if (week==6) {
//			  weekStr = "금";
//		  }else {
//			  weekStr = "토";
//		  }
		  
		  switch(week) {
		  	case 1: weekStr = "일"; break;
		  	case 2: weekStr = "월"; break;
		  	case 3: weekStr = "화"; break;
		  	case 4: weekStr = "수"; break;
		  	case 5: weekStr = "목"; break;
		  	case 6: weekStr = "금"; break;
		  	case 7: weekStr = "토";
		  	
		  }
		  
		// 출력 형식 예시: 2021-11-17(수) 15:34
		  System.out.printf("%d-%d-%d(%s) %d:%d",year,month+1,day,weekStr, hour,min);
		
		//년월일
//		Scanner s = new Scanner(System.in);
//		System.out.print("년도를 입력하세요?=");
//		int year_get = s.nextInt();
//		System.out.print("월을 입력하세요?=");
//		int month_get = s.nextInt();
//		System.out.print("날dus=짜를 입력하세요?=");
//		int day_get = s.nextInt();

	}

}