package algorithm;

//http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=574&sca=2010&sfl=wr_hit&stx=1291

import java.util.Scanner;

public class Solution07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		
		while(true) {
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			
			//구구단의 크기를 벗어나면 while문 다시 시작
			if((1 > number1 || 9 < number1) || (1 > number2 || 9 < number2)) {
				System.out.println("INPUT ERROR!");
			}else {
				for(int i=1; i<10; i++) {
					System.out.printf( "%d * %d = %3d" ,number1, i, number1*i);
					System.out.printf( "%4d * %d = %3d \n" ,number2, i, number2*i);
					
				}
				return;
			}
		}
		
	}
}
