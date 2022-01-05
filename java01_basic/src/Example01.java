import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		//1.
//		System.out.print("첫번째 수=>");
//		int first = Integer.parseInt(s.nextLine());
//
//		System.out.print("첫번째 수=>");
//		int second = Integer.parseInt(s.nextLine());
//		
//		int check = first;
//		
//		if(first<second) {
//			check = second;
//		}
//		
//		System.out.println(check);
//		
//		//2.
//		System.out.println("=========================");
//		System.out.printf("정수를 입력=");
//		
//		int max = Integer.parseInt(s.nextLine());
//		int sum = 0;
//		int oddSum = 0;
//		int evenSum = 0;
//		
//		for(int num=1; num<=max; num++) {
//			sum += num;
//			//짝수면 1 == 1.0 >> 짝수
//			//홀수면 1 == 1.5 >> 홀수
//			if(num/2 == num/2.0) {
//				evenSum += num;
//			}else {
//				oddSum += num;
//			}
//		}
//		System.out.println("1~"+max+"까지의 합은"+sum);
//		System.out.println("1~"+max+"까지의 홀수합은"+oddSum);
//		System.out.println("1~"+max+"까지의 짝수합은"+evenSum);
		
		
		//3.
		System.out.println("=========================");
		
		for(int dan=1;dan<10;dan++){
			if(dan%3==0) {
				System.out.println();
			}
		}
		
		
	
		
		
		
		
		
	}
}
