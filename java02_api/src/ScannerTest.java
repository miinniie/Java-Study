import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//ScannerŬ������ �̿��Ͽ� �ֿܼ��� ������ �Է� ���� ���
		//new : ScannerŬ������ ��ü�� �����Ѵ�.
		//���۷��� ����/�ν��Ͻ� (ex.scanner����): class �� ����� ���� <-> �⺻�� ���� (ex. int, double...) 
		Scanner scan =new Scanner(System.in);
		// nextInt() : �޼ҵ� ȣ��, �ֿܼ��� ���ڸ� �Է¹޾� ����(int��)�� ��ȯ�Ͽ� �ִ� �޼ҵ�
		System.out.print("����=");
		int num = scan.nextInt()*10;

		System.out.println("num=" + num);
	}

}
