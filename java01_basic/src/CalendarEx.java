import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {

	public static void main(String[] args) {
		
		do {
			
			//1.��,�� �Է°� �ޱ�
			Scanner s = new Scanner(System.in);
			System.out.print("�⵵=");
			int year = Integer.parseInt(s.nextLine());
			System.out.print("��=");
			int month = Integer.parseInt(s.nextLine());
			
			Calendar date = Calendar.getInstance();
			date.set(year, month-1,1);
			int week = date.get(Calendar.DAY_OF_WEEK); //����
			
			// 30: 4,6,9,11
			// 31: 1,3,5,7,8,10,12
			// 28,28: 2
			
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
			
			System.out.printf("\t\t%d��\t%d��\t\t\n",year,month);
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			//�������
			for(int space=1; space<week; space++) {
				System.out.print(" \t");
			}
			
			//��¥ ���
			for(int day=1; day<=lastDay; day++) {
				System.out.print(day+"\t");
				if((day+week-1)%7==0) System.out.println();
			}
		
			
			System.out.print("\n����Ͻðڽ��ϱ�?(��:y, �ƴϿ�:n)");
			String que = s.nextLine();

			if (!que.equals("y")) {
				break;
			}
			
		}while(true);
			
	}
}
