import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		// �ֿܼ��� ���ڸ� �Է¹޾� ����̸� 100�踦 �Ͽ� ����϶�
		
		System.out.print("����=");
		int inData = scan.nextInt();
		
		if (1<inData && inData<100) {
			int result = inData*100;
			System.out.printf("%d*100 = %d\n", inData, result);
		}	
		System.out.printf("end.....");
	}
}