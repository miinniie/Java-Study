import java.util.Calendar;
import java.util.Scanner;

public class CalendarObject {
	
	//ȣ��� �ٷ� ������ �� �ֵ����ϸ��� ������ �޼ҵ忡 �־���
	CalendarObject(){
		myCalendar();
	}
	
	//���ϱ��ϱ�
	int getWeek(int year, int month) {
		Calendar date = Calendar.getInstance();
		date.set(year, month-1,1);
		return date.get(Calendar.DAY_OF_WEEK);
	}
	
	//�������� ���ϱ�
	int getLastDay(int year, int month){
		int lastDay =31; //�ʱⰪ
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay=30;
				break;
			case 2:
				//����: 4�ǹ���� �������� 100�� ����� �ƴ���
				//     400�⿡ �ѹ����� ������ ����
				if(year%4==0 && year%100!=0 || year%400==0) {
					lastDay = 29;
				}else {
					lastDay=28;
				}
		}
		return lastDay;
	}
	
	//�޷� ���� ���
	void titlePrint(int year, int month) {
		System.out.printf("\t\t%d��\t%d��\t\t\n",year,month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	}
	
	//��¥ ����� ����ó��
	void spacePrint(int week) {
		for(int space=1; space<week; space++) {
			System.out.print(" \t");
		}
	}
	
	//��¥ ���
	void dayPrint(int week, int lastDay) {
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if((day+week-1)%7==0) System.out.println();
		}
	}
	
	
	//��� ���� Ȯ��
	boolean question(){
			Scanner scan = new Scanner(System.in);
			//��ӿ��� Ȯ��
			System.out.print("\n����Ͻðڽ��ϱ�?(��:y, �ƴϿ�:n)");
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
			int y = gugu.consoleInput("�⵵");
			int m = gugu.consoleInput("����");
			int w = getWeek(y,m);
			int lastDay = getLastDay(y,m);
			
			titlePrint(y,m);
			spacePrint(w);
			dayPrint(getLastDay(y,m),w);
			
		}while(question());
	}
	
	
	
	
//	//1.�Է°� �ޱ� (��,��)
//	int consoleInputYear(String msg) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print(msg+"=");
//		return scan.nextInt();
//	}
//	
//	//2. ���� �����ϱ�
//	int Week(int year, int month) {
//		Calendar date = Calendar.getInstance();
//		date.set(year, month-1,1);
//		return date.get(Calendar.DAY_OF_WEEK); //����
//	}
//	
//	//3.���� ���ϼ� ���ϱ�
//	int switchToDayInMonth(int year, int month){
//		int lastDay =31; //�ʱⰪ
//		switch(month) {
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				lastDay=30;
//				break;
//			case 2:
//				//����: 4�ǹ���� �������� 100�� ����� �ƴ���
//				//     400�⿡ �ѹ����� ������ ����
//				if(year%4==0 && year%100!=0 || year%400==0) {
//					lastDay = 29;
//				}else {
//					lastDay=28;
//				}
//		}
//		return lastDay;
//	}
//	
//	//4.�޷� ���� ���� ���
//	void printTop(int year, int month) {
//		System.out.printf("\t\t%d��\t%d��\t\t\n",year,month);
//		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//	}
//	
//	//5.�޷� ���
//	void printAll(int week, int lastDay) {
//		
//		//�������
//		for(int space=1; space<week; space++) {
//			System.out.print(" \t");
//		}
//		
//		//��¥ ���
//		for(int day=1; day<=lastDay; day++) {
//			System.out.print(day+"\t");
//			if((day+week-1)%7==0) System.out.println();
//		}
//		
//	}
	
	
}
