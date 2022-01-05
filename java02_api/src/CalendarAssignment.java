import java.util.Calendar;
import java.util.Scanner;

public class CalendarAssignment {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		
		//1.년,월 입력값 받기
		Scanner s = new Scanner(System.in);
		System.out.print("년도=");
		int year = s.nextInt();
		System.out.print("월=");
		int month = s.nextInt()-1; //월은 하나 빼고 계산
	
		//2. 입력 받은 년월로 api 정보 변경
		now.set(year,month,1); //1일의 요일을 계산하기 위함
		
		//3. 입력 받은 월의 날짜수를 계산
		int days_in_month=30;
		
		switch(month) {
			case 1:                 //2월 (1) = 28일
				days_in_month = 28;
				break;
			case 0:                 //1,3,5,7,8,10,12 (0,2,4,6,7,9,11) = 31일
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				days_in_month = 31;
				break;
			default:
				days_in_month = 30;
		}
		System.out.println(days_in_month);
		
		
		//4. 입력 받은 년월의 첫번째 요일 변수	
		int week = now.get(Calendar.DAY_OF_WEEK);
		  
		//5. 윤년 계산
		  if(month==2 && year%4==0 && year%100!=0 || month==2 && year%400==0) {
			  days_in_month = 29;
			}else {
				days_in_month=28;
			}
		  
		//6. 달력 그리기
		System.out.printf("\t\t%d년\t%d월\t\t\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//공백출력
		for(int space=1; space<week; space++) {
			System.out.print(" \t");
		}
		
		for(int i=1; i<=days_in_month;i++) {
			System.out.printf(i+"\t");
			
			if((i+week-1)%7==0) {
				System.out.println();
			}
		} 
		  
		  
		  
		  
	}
}
