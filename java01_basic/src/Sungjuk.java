import java.util.Scanner;

public class Sungjuk {

	public static void main(String[] args) {
		// 콘솔에서 국어, 영어, 수학저무를 입력 받아
		// 총점, 평균, 학점을 구하라.
		/*
		 학점 기준
		 90 ~ 100 A
		 80 ~ 89  B
		 70 ~ 79  C
		 60 ~ 69  D
		 0 ~ 59   F
		 
		 실행
		 국어=80
		 영어	=80
		 수학=80
		 --
		 총점=240
		 평균=80.0
		 학점=B		 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.print("국어=");
		int korean = s.nextInt();
		
		System.out.print("영어=");
		int english = s.nextInt();

		System.out.print("수학=");
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
		
		System.out.printf("총점=%d\n평균=%f\n학점=%s\n", total, average, grade);
		
		/*
		System.out.printf("학점%s\n", grade);
		System.out.printf("총점=%d\n",total);
		System.out.printf("평균%f\n",average);
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
				
		System.out.printf("총점=%d\n평균=%f\n학점=%s\n", total, average, grade);			
			
		}
			
	}

}
