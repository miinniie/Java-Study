import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Ǽ�=");
		int num = scan.nextInt();
		
		int result = ((num/10)*10)+1;
		
		System.out.printf("ó�����=%d", result);
		
		
	}
}
