import java.util.Scanner;

public class IfelseTest {

	public static void main(String[] args) {
		// 정수를 입력받아
		//	양수이면 100을 곱하여 출력하고
		// 	음수이면 양수로 만들어 100을 곱하여 출력하라.
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요=");
		
		int n = s.nextInt();
		char c;
		
		if(n<-10) {
			c = 'A';	
		}else if(n<=10) {
			c = 'B';
		}else {
			c = 'C';
		}
		System.out.println(c);
	}

}
