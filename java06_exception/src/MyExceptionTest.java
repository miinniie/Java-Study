import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	
	Scanner scan = new Scanner(System.in);
	
	//�����ڸ޼ҵ�
	public MyExceptionTest(){}
	
	//1~100������ ���� �Է¹޾�
	//�Է¹��� �������� ���� ���Ͽ� ����϶�
		
	//�ձ��ϱ�
	public void sum(int max) {
		int total = 0;
		for(int i=1; i<=max; i++) {
			total += i;
		}
		System.out.println("1~"+max+"������ ���� "+ total);
	}
	public void start() {
		try {
			System.out.println("1~100������ ����=");
			int max = scan.nextInt();
			
			if(max>=1 && max<=100) {
				
			}else {
				//���ܸ� ������ �߻���Ų��
				throw new MyException("�Է°��� 1~100������ �������̿��� �մϴ�.");
			}
		}catch(InputMismatchException ime) {
			System.out.println("���ڸ� �Է��Ͽ� �մϴ�");
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}
		
	}
	
	public static void main(String[] args) {	
		MyExceptionTest mt = new MyExceptionTest();
		mt.start();
	}
}
