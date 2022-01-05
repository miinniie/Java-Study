import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의수=");
		int num = scan.nextInt();
		
		int result = ((num/10)*10)+1;
		
		System.out.printf("처리결과=%d", result);
		
		
	}
}
