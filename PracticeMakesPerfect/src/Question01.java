import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사과의 갯수=");
		int apple = scan.nextInt();
		
		int result = apple%10==0? apple/10: apple/10+1;
		
		System.out.printf("바구니수=%d", result);
		
	}
}
