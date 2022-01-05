import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	
	Scanner scan = new Scanner(System.in);
	
	//생성자메소드
	public MyExceptionTest(){}
	
	//1~100사이의 값을 입력받아
	//입력받은 수까지의 합을 수하여 출력하라
		
	//합구하기
	public void sum(int max) {
		int total = 0;
		for(int i=1; i<=max; i++) {
			total += i;
		}
		System.out.println("1~"+max+"까지의 합은 "+ total);
	}
	public void start() {
		try {
			System.out.println("1~100사이의 정수=");
			int max = scan.nextInt();
			
			if(max>=1 && max<=100) {
				
			}else {
				//에외를 강제로 발생시킨다
				throw new MyException("입력값은 1~100사이의 데이터이여아 합니다.");
			}
		}catch(InputMismatchException ime) {
			System.out.println("숫자만 입력하여 합니다");
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}
		
	}
	
	public static void main(String[] args) {	
		MyExceptionTest mt = new MyExceptionTest();
		mt.start();
	}
}
