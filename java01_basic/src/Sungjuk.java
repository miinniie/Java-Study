import java.util.Scanner;

public class Sungjuk {

	public static void main(String[] args) {
		// �ֿܼ��� ����, ����, ���������� �Է� �޾�
		// ����, ���, ������ ���϶�.
		/*
		 ���� ����
		 90 ~ 100 A
		 80 ~ 89  B
		 70 ~ 79  C
		 60 ~ 69  D
		 0 ~ 59   F
		 
		 ����
		 ����=80
		 ����	=80
		 ����=80
		 --
		 ����=240
		 ���=80.0
		 ����=B		 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.print("����=");
		int korean = s.nextInt();
		
		System.out.print("����=");
		int english = s.nextInt();

		System.out.print("����=");
		int math = s.nextInt();
		
		char grade;
		int total = korean + english + math;
		double average = total/3.0;

		/*
		 
		if(average>=90 && average<=100) {
			grade = 'A';
		}else if(average>=80 && average<90) {
			grade = 'B';
		}else if(average>=70 && average<80) {
			grade = 'C';
		}else if(average>=60 && average<70) {
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		System.out.printf("����=%d\n���=%f\n����=%s\n", total, average, grade);
		
		/*
		System.out.printf("����%s\n", grade);
		System.out.printf("����=%d\n",total);
		System.out.printf("���%f\n",average);
		 */
		
		
		int newAverage = (int)average;
	
		switch(newAverage/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
		System.out.printf("����=%d\n���=%f\n����=%s\n", total, average, grade);			
			
		}
			
	}

}
