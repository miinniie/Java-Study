import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// ���� �ý����� ��¥, �ð��� ���õ� ������ ��ü�� ���Ѵ�.
		// Calendar Ŭ������ new�� ��ü�� ������ �� ����.
		// ��ü�� �����Ͽ� �������ִ� getInstance()�޼ҵ带 �̿��Ѵ�.
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		//��¥ �Ǵ� �ð� �����ϱ�
		//�����
		now.set(2021,11,1);
//		//����Ͻú�
//		now.set(2020,5,25,13,50);
//		//����Ͻú���
//		now.set(2023,4,10,10,20,30);
//		//�⵵�� ����
//		now.set(Calendar.YEAR,2022); //�ٷ� ���� set method ����
		
		String weekStr="";
		
		  int year  = now.get(Calendar.YEAR);
		  int month = now.get(Calendar.MONTH);//Ư���ϰ� ���� 0������ ����, +1�ؼ� ����ؾߵ�
		  int day   = now.get(Calendar.DAY_OF_MONTH);
		  int week  = now.get(Calendar.DAY_OF_WEEK);
		  int hour  = now.get(Calendar.HOUR_OF_DAY);
		  int min   = now.get(Calendar.MINUTE);
//		  int sec   = now.get(Calendar.SECOND);
		  
//		  if (week==1) {
//			  weekStr = "��";
//		  }else if (week==2) {
//			  weekStr = "��";
//		  }else if (week==3) {
//			  weekStr = 'ȭ';
//		  }else if (week==4) {
//			  weekStr = "��";
//		  }else if (week==5) {
//			  weekStr = "��";
//		  }else if (week==6) {
//			  weekStr = "��";
//		  }else {
//			  weekStr = "��";
//		  }
		  
		  switch(week) {
		  	case 1: weekStr = "��"; break;
		  	case 2: weekStr = "��"; break;
		  	case 3: weekStr = "ȭ"; break;
		  	case 4: weekStr = "��"; break;
		  	case 5: weekStr = "��"; break;
		  	case 6: weekStr = "��"; break;
		  	case 7: weekStr = "��";
		  	
		  }
		  
		// ��� ���� ����: 2021-11-17(��) 15:34
		  System.out.printf("%d-%d-%d(%s) %d:%d",year,month+1,day,weekStr, hour,min);
		
		//�����
//		Scanner s = new Scanner(System.in);
//		System.out.print("�⵵�� �Է��ϼ���?=");
//		int year_get = s.nextInt();
//		System.out.print("���� �Է��ϼ���?=");
//		int month_get = s.nextInt();
//		System.out.print("��dus=¥�� �Է��ϼ���?=");
//		int day_get = s.nextInt();

	}

}