import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		/*
		 �ڼֿ��� ������ �Է¹޾� ¦���� 3���� ����
		 Ȧ���� 4���� ���� ����϶�
		 
		 ������
		 ����=5
		 5�� 4��� 20�̴�.
		 
		 ����=4
		 4�� 3��� 12�̴�
		 */
		
//		Scanner s =new Scanner(System.in);
//		System.out.print("����=");
//		
//		int data = s.nextInt();
//				
//		int result = (data%2==0)? 3: 4;
//		
//		System.out.println(data + "�� "+ result +"��� " + data*result + "�̴�");
		
		// ���׿�����
		int a=10;
		a++;
		System.out.println(a);
		
		int b = a--; // �����ڰ� ���� �ڿ� �ִٸ� (ex.a++) ����� ������ �Ѱ��ְ� ���� ���� ������ �� (������ �켱����)
		System.out.println("b=" + b + ", a=" + a);
		
		char c = 'A';
		//c++;
		char d = c++; //d = "B, d = "" 
		
		int e = c+1; //char �̶� int�� ����ϸ� int
				
		
		char f = (char)(c+1); // ���� ����ȯ
		
		System.out.println(e + "�׸���" c);
		
	}	
}