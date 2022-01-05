import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionTest3 {
	
		Scanner scan = new Scanner(System.in);
		//2. 메소드를 이용하는 방법
		public ExceptionTest3() {}
		public void method1() throws ArrayIndexOutOfBoundsException, ArithmeticException, InputMismatchException{ //배열 예외 추가
			int num = scan.nextInt();
			int num2 = scan.nextInt();
			method2(num,num2);
		}
		public void method2(int num, int num2) throws ArrayIndexOutOfBoundsException, ArithmeticException { //배열 예외 추가 (콤마하게 여러개)
			int result = num /num2;
			System.out.printf("%d / %d = %d\n", num, num2, result);
			method3(num);
		}
		public void method3(int num) throws ArrayIndexOutOfBoundsException{ //배열 예외 추가
			int arr[] = new int[num];
			arr[num] = 562; ////에러 시작
		}
		public static void main(String[] args) throws ArrayIndexOutOfBoundsException{ //배열 예외 추가
			ExceptionTest3 t = new ExceptionTest3();
			try {
				t.method1();
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열index예외발생.."); //이게 출력되면 결국은 main까지 왔다는 뜻
			}catch(ArithmeticException ae) {
				System.out.println("0으로 나눌 수 없습니다.");
			}catch(InputMismatchException im) {
				System.out.println("문자를 입력할 수 없습니다");
			}
		}
				
}
