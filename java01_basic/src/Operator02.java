import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		// ������ �ֿܼ��� ������ �Է¹޾� Ȧ��/¦���� �����Ͽ� ����϶�.
		/*
		 ���� ���
		 ���� ���� �Է� = 243
		 243�� Ȧ�� �Դϴ�.
		 */
		
		Scanner s =new Scanner(System.in);
		System.out.print("���� ���� �Է�=");
		int data = s.nextInt();
		
		String result = (data%2==0)? "¦��": "Ȧ��"; // ���׿�����
		
		System.out.println(data + "�� "+ result + "�Դϴ�");
		
//		if (data%2==1) {
//			System.out.println(data + "�� Ȧ���Դϴ�");
//		}else {
//			System.out.println(data + "�� ¦���Դϴ�");
//		}
		
	}

}
