import java.util.Calendar;
import java.util.Scanner;

public class CalendarAssignment {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		
		//1.��,�� �Է°� �ޱ�
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵=");
		int year = s.nextInt();
		System.out.print("��=");
		int month = s.nextInt()-1; //���� �ϳ� ���� ���
	
		//2. �Է� ���� ����� api ���� ����
		now.set(year,month,1); //1���� ������ ����ϱ� ����
		
		//3. �Է� ���� ���� ��¥���� ���
		int days_in_month=30;
		
		switch(month) {
			case 1:                 //2�� (1) = 28��
				days_in_month = 28;
				break;
			case 0:                 //1,3,5,7,8,10,12 (0,2,4,6,7,9,11) = 31��
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
		
		
		//4. �Է� ���� ����� ù��° ���� ����	
		int week = now.get(Calendar.DAY_OF_WEEK);
		  
		//5. ���� ���
		  if(month==2 && year%4==0 && year%100!=0 || month==2 && year%400==0) {
			  days_in_month = 29;
			}else {
				days_in_month=28;
			}
		  
		//6. �޷� �׸���
		System.out.printf("\t\t%d��\t%d��\t\t\n",year,month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//�������
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
