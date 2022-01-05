import java.util.Scanner;
import java.util.Calendar;

public class CalendarPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도=");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("월=");
		int month = Integer.parseInt(scan.nextLine());
		
		Calendar date = Calendar.getInstance();
		date.set(year,month-1,1);
		
		int week = date.get(Calendar.DAY_OF_WEEK) ;
		
		//한달이 며칠인지 나옴
		int lastday = 31;
		switch(month) {
			case 1: 
			case 3: 
			case 5:
			case 8:
			case 10:
				lastday=30;
				break;
			case 2:
				if (year%4==0 && year%100!=0 || year%400==0) {
					lastday=29;
				}else {
					lastday=28;
				}
		}
		
		
		//인쇄문 찍기
		System.out.printf("\t\t%d년 %d일\t\t\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//공백 출력		
		for (int i=0; i<week-1; i++)
			System.out.print("공백\t");
			for(int j=0; j<week ;j++) {
				
			}
			
			
		//날짜 출력
		
	}
}
