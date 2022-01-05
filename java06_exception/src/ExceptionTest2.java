import java.util.Scanner;

public class ExceptionTest2 {
	
	public void start() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("정수입력=");
			int num = Integer.parseInt(scan.nextLine()); //////
			
			System.out.print("정수입력=");
			int num2 = Integer.parseInt(scan.nextLine()); /////
			
			int result = num/num2; //////
			System.out.printf("%d / %d = %d\n", num, num2, result);
			
			int arr[] = new int[5];
			arr[arr.length] = 100; //////
			
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae.getMessage());
			
		}catch(NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀 수 없다");
			
		}catch(Exception e) {
			//Exception은 상위클래스이기 때문에 모든 예외를 대입할 수 있다.
			e.printStackTrace();
		}finally {
			//에외가 발생하든 안하든 실행된다.
			System.out.println("finally 실행됨..");
			try {
				
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new ExceptionTest2().start();
	
	}
}
