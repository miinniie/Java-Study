import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	
	public ExceptionTest() {
		
	}
	public void start() {
		//Exception 처리:software로 제어할 수 있는 error를 말한다.
		//Exception 처리방법
		//1. try ~ catch문을 이용하는 방법
		//2. 메소드를 이용하는 방법
		
		try {
			//try문 : 에외발생가능성이 있는 코드와
			//       예외발생가능성이 없는 코드를 기술한다.
			Scanner scan = new Scanner(System.in);
			System.out.print("정수입력=");
			int num = scan.nextInt();
			
			System.out.print("정수입력=");
			int num2 = scan.nextInt();
			
			int result = num/num2;
			System.out.printf("%d / %d = %d/n", num, num2, result);
			
			int arr[] = new int[5];
			arr[arr.length] = 100;
			
		}catch(InputMismatchException ime) {//에외가 발생하면 실행되는 영역이다. (어떤종류의 에러인지 괄호안에 기술)
			System.out.print("문자를 입력할 수 없습니다");
			//getMessage();
			System.out.println(ime.getMessage());
			//printStackTrace(): 실제로 콘솔에 출력되는 에러 메세지
			ime.printStackTrace();
			
		}catch(ArithmeticException ae) {//에러 메세지가 여러개면은 연달아서 출력한다
			System.out.println("0으로 나놀 수 없습니다.");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("\n배열의 길이가 5를 넘을 수 없습니다");
			System.out.println(aie.getMessage());
//			aie.printStackTrace();
		}
		
		System.out.println("\nThe End....");
		
	}
	
	public static void main(String[] args) {
		new ExceptionTest().start();
	}
	
}
