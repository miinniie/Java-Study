import java.util.Scanner;

public class IfelseTest {

	public static void main(String[] args) {
		// ������ �Է¹޾�
		//	����̸� 100�� ���Ͽ� ����ϰ�
		// 	�����̸� ����� ����� 100�� ���Ͽ� ����϶�.
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���=");
		
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