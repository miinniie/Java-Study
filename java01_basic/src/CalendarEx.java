import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {
		
		do {
			
			//1.년,월 입력값 받기
			Scanner s = new Scanner(System.in);
			System.out.print("년도=");
			int year = Integer.parseInt(s.nextLine());
			System.out.print("월=");
			int month = Integer.parseInt(s.nextLine());
			
			Calendar date = Calendar.getInstance();
			date.set(year, month-1,1);
			int week = date.get(Calendar.DAY_OF_WEEK); //요일
			
			// 30: 4,6,9,11
			// 31: 1,3,5,7,8,10,12
			// 28,28: 2
			
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
			
			System.out.printf("\t\t%d년\t%d월\t\t\n",year,month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			//공백출력
			for(int space=1; space<week; space++) {
				System.out.print(" \t");
			}
			
			//날짜 출력
			for(int day=1; day<=lastDay; day++) {
				System.out.print(day+"\t");
				if((day+week-1)%7==0) System.out.println();
			}
		
			
			System.out.print("\n계속하시겠습니까?(예:y, 아니오:n)");
			String que = s.nextLine();

			if (!que.equals("y")) {
				break;
			}
			
		}while(true);
			
	}
}
