import java.util.Calendar;
import java.util.Scanner;

public class CalendarObject {
	
	//호출시 바로 실행할 수 있도록하면은 생성자 메소드에 넣어줌
	CalendarObject(){
		myCalendar();
	}
	
	//요일구하기
	int getWeek(int year, int month) {
		Calendar date = Calendar.getInstance();
		date.set(year, month-1,1);
		return date.get(Calendar.DAY_OF_WEEK);
	}
	
	//마지막날 구하기
	int getLastDay(int year, int month){
		int lastDay =31; //초기값
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay=30;
				break;
			case 2:
				//윤년: 4의배수의 해이지만 100의 배수가 아닌해
				//     400년에 한번씩은 무조건 윤년
				if(year%4==0 && year%100!=0 || year%400==0) {
					lastDay = 29;
				}else {
					lastDay=28;
				}
		}
		return lastDay;
	}
	
	//달력 제목 출력
	void titlePrint(int year, int month) {
		System.out.printf("\t\t%d년\t%d월\t\t\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	
	//날짜 출력전 공백처리
	void spacePrint(int week) {
		for(int space=1; space<week; space++) {
			System.out.print(" \t");
		}
	}
	
	//날짜 출력
	void dayPrint(int week, int lastDay) {
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if((day+week-1)%7==0) System.out.println();
		}
	}
	
	
	//계속 여부 확인
	boolean question(){
			Scanner scan = new Scanner(System.in);
			//계속여부 확인
			System.out.print("\n계속하시겠습니까?(예:y, 아니오:n)");
			String que = scan.nextLine();

			if (!que.equals("y")) {
				return false;
			}else {
				return true;
			}
		}
	
	
	void myCalendar() {
		GuGuDan gugu = new GuGuDan();
		do {
			int y = gugu.consoleInput("년도");
			int m = gugu.consoleInput("요일");
			int w = getWeek(y,m);
			int lastDay = getLastDay(y,m);
			
			titlePrint(y,m);
			spacePrint(w);
			dayPrint(getLastDay(y,m),w);
			
		}while(question());
	}
	
	
	
	
//	//1.입력값 받기 (년,월)
//	int consoleInputYear(String msg) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print(msg+"=");
//		return scan.nextInt();
//	}
//	
//	//2. 요일 세팅하기
//	int Week(int year, int month) {
//		Calendar date = Calendar.getInstance();
//		date.set(year, month-1,1);
//		return date.get(Calendar.DAY_OF_WEEK); //요일
//	}
//	
//	//3.월별 요일수 구하기
//	int switchToDayInMonth(int year, int month){
//		int lastDay =31; //초기값
//		switch(month) {
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				lastDay=30;
//				break;
//			case 2:
//				//윤년: 4의배수의 해이지만 100의 배수가 아닌해
//				//     400년에 한번씩은 무조건 윤년
//				if(year%4==0 && year%100!=0 || year%400==0) {
//					lastDay = 29;
//				}else {
//					lastDay=28;
//				}
//		}
//		return lastDay;
//	}
//	
//	//4.달력 상위 형식 출력
//	void printTop(int year, int month) {
//		System.out.printf("\t\t%d년\t%d월\t\t\n",year,month);
//		System.out.println("일\t월\t화\t수\t목\t금\t토");
//	}
//	
//	//5.달력 출력
//	void printAll(int week, int lastDay) {
//		
//		//공백출력
//		for(int space=1; space<week; space++) {
//			System.out.print(" \t");
//		}
//		
//		//날짜 출력
//		for(int day=1; day<=lastDay; day++) {
//			System.out.print(day+"\t");
//			if((day+week-1)%7==0) System.out.println();
//		}
//		
//	}
	
	
}
