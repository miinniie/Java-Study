import java.util.Scanner;
import java.util.Calendar;

public class CalendarPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�⵵=");
		int year = Integer.parseInt(scan.nextLine());
		System.out.print("��=");
		int month = Integer.parseInt(scan.nextLine());
		
		Calendar date = Calendar.getInstance();
		date.set(year,month-1,1);
		
		int week = date.get(Calendar.DAY_OF_WEEK) ;
		
		//�Ѵ��� ��ĥ���� ����
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
		
		
		//�μ⹮ ���
		System.out.printf("\t\t%d�� %d��\t\t\n", year, month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//���� ���		
		for (int i=0; i<week-1; i++)
			System.out.print("����\t");
			for(int j=0; j<week ;j++) {
				
			}
			
			
		//��¥ ���
		
	}
}
