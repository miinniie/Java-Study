import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("수입력=");
		int num = scan.nextInt();
		for(int i=1; i<=100; i++) {
			if(i%3!=0 && i%5!=0) {
				System.out.println(i);
			}
		}
		
	}
}

/*
 실행
 수입력=100
 1
 2
 4
 7
 8
 .
 .
 13
 14
 16
 17
 .
 97
 98
 */
