import java.util.Scanner;

public class GuGuDan {

		//�������
		CalculatorEx cc = new CalculatorEx();
			
		//�����ڸ޼ҵ�		
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

		//�ֿܼ��� ���� �Է¹޴� �޼ҵ�
		int consoleInput(String msg) {
			Scanner scan = new Scanner(System.in);
			System.out.println(msg+"=");
			return scan.nextInt();
		}


		
		
		
		
		
}
