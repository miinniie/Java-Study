import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		//1.
//		System.out.print("ù��° ��=>");
//		int first = Integer.parseInt(s.nextLine());
//
//		System.out.print("ù��° ��=>");
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
//		System.out.printf("������ �Է�=");
//		
//		int max = Integer.parseInt(s.nextLine());
//		int sum = 0;
//		int oddSum = 0;
//		int evenSum = 0;
//		
//		for(int num=1; num<=max; num++) {
//			sum += num;
//			//¦���� 1 == 1.0 >> ¦��
//			//Ȧ���� 1 == 1.5 >> Ȧ��
//			if(num/2 == num/2.0) {
//				evenSum += num;
//			}else {
//				oddSum += num;
//			}
//		}
//		System.out.println("1~"+max+"������ ����"+sum);
//		System.out.println("1~"+max+"������ Ȧ������"+oddSum);
//		System.out.println("1~"+max+"������ ¦������"+evenSum);
		
		
		//3.
		System.out.println("=========================");
		
		for(int dan=1;dan<10;dan++){
			if(dan%3==0) {
				System.out.println();
			}
		}
		
		
	
		
		
		
		
		
	}
}
