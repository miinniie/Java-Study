import java.util.Scanner;

public class ifElseifEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("(1: �簢���� ����, 2: ���� ����)");
		int check = s.nextInt();
					
		if(check==1) {
			System.out.print("����=");
			int square1 = s.nextInt();
			
			System.out.print("����=");
			int square2 = s.nextInt();
			
			System.out.printf("�簢���� ���̴� %d", square1*square2);
			
		}else if (check==2) {
			System.out.print("������=");
			int circle = s.nextInt();
			System.out.printf("���� ���̴� %f\n", Math.PI*Math.pow(circle,2));
			System.out.printf("���� ���̴� %f", 3.141592*Math.pow(circle,2)); 
			
		}else {
			System.out.println("�޴��� �߸� �����Ͽ����ϴ�"
					+ "");
		}
	}
}

/*
 ������
 �޴� ���� (1: �簢���� ����, 2: ���� ����) ?1
 ����= 20
 ����= 10
 �簢������ ���̴� 200
 
 �޴� ���� (1: �簢���� ����, 2: ���� ����) ?2
 ������ = 3
 ���� ���� = 
 
 �޴� ���� (1: �簢���� ����, 2: ���� ����) ?2
 ������ = 3
 ���� ���� = 
 */
		