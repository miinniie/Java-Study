import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	
	public ExceptionTest() {
		
	}
	public void start() {
		//Exception ó��:software�� ������ �� �ִ� error�� ���Ѵ�.
		//Exception ó�����
		//1. try ~ catch���� �̿��ϴ� ���
		//2. �޼ҵ带 �̿��ϴ� ���
		
		try {
			//try�� : ���ܹ߻����ɼ��� �ִ� �ڵ��
			//       ���ܹ߻����ɼ��� ���� �ڵ带 ����Ѵ�.
			Scanner scan = new Scanner(System.in);
			System.out.print("�����Է�=");
			int num = scan.nextInt();
			
			System.out.print("�����Է�=");
			int num2 = scan.nextInt();
			
			int result = num/num2;
			System.out.printf("%d / %d = %d/n", num, num2, result);
			
			int arr[] = new int[5];
			arr[arr.length] = 100;
			
		}catch(InputMismatchException ime) {//���ܰ� �߻��ϸ� ����Ǵ� �����̴�. (������� �������� ��ȣ�ȿ� ���)
			System.out.print("���ڸ� �Է��� �� �����ϴ�");
			//getMessage();
			System.out.println(ime.getMessage());
			//printStackTrace(): ������ �ֿܼ� ��µǴ� ���� �޼���
			ime.printStackTrace();
			
		}catch(ArithmeticException ae) {//���� �޼����� ���������� ���޾Ƽ� ����Ѵ�
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("\n�迭�� ���̰� 5�� ���� �� �����ϴ�");
			System.out.println(aie.getMessage());
//			aie.printStackTrace();
		}
		
		System.out.println("\nThe End....");
		
	}
	
	public static void main(String[] args) {
		new ExceptionTest().start();
	}
	
}
