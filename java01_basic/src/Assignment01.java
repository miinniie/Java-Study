import java.util.Scanner;

// 1. ���� �ΰ��� �Է� �޾� ū ���� ����϶� 
public class Assignment01 {
	public static void main(String[] args) {
		
		// ����1,����2 �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("����1=");
		int num1 = scan.nextInt();
		
		System.out.print("����2=");
		int num2 = scan.nextInt();
		
		//�� ū �� ���
		int answer = num1; //����Ʈ�� num1 
		
		if(num2>num1) {
			answer = num2;
			System.out.println("ū ����="+answer);
		}else {
			System.out.println("ū ����="+answer);
		}
	}

}
