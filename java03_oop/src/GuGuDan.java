import java.util.Scanner;

public class GuGuDan {

		//멤버영역
		CalculatorEx cc = new CalculatorEx();
			
		//생성자메소드		
		void gugudan(int dan) {
			for(int i=2; i<=9 ; i++) {
				int result = cc.multiple(dan, i);
				System.out.printf("%d*%d=%d\n",dan,i,result);
			}
		}
		
		void allGugudan() {
			for(int dan=2; dan<=9; dan++){
				for(int i=2; i<=9; i++) {
					System.out.printf("%d*%d=%d\n",dan,i,cc.multiple(dan, i));
				}
			}
		}

		//콘솔에서 정수 입력받는 메소드
		int consoleInput(String msg) {
			Scanner scan = new Scanner(System.in);
			System.out.println(msg+"=");
			return scan.nextInt();
		}


		
		
		
		
		
}
