import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionTest3 {
	
		Scanner scan = new Scanner(System.in);
		//2. �޼ҵ带 �̿��ϴ� ���
		public ExceptionTest3() {}
		public void method1() throws ArrayIndexOutOfBoundsException, ArithmeticException, InputMismatchException{ //�迭 ���� �߰�
			int num = scan.nextInt();
			int num2 = scan.nextInt();
			method2(num,num2);
		}
		public void method2(int num, int num2) throws ArrayIndexOutOfBoundsException, ArithmeticException { //�迭 ���� �߰� (�޸��ϰ� ������)
			int result = num /num2;
			System.out.printf("%d / %d = %d\n", num, num2, result);
			method3(num);
		}
		public void method3(int num) throws ArrayIndexOutOfBoundsException{ //�迭 ���� �߰�
			int arr[] = new int[num];
			arr[num] = 562; ////���� ����
		}
		public static void main(String[] args) throws ArrayIndexOutOfBoundsException{ //�迭 ���� �߰�
			ExceptionTest3 t = new ExceptionTest3();
			try {
				t.method1();
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭index���ܹ߻�.."); //�̰� ��µǸ� �ᱹ�� main���� �Դٴ� ��
			}catch(ArithmeticException ae) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}catch(InputMismatchException im) {
				System.out.println("���ڸ� �Է��� �� �����ϴ�");
			}
		}
				
}
