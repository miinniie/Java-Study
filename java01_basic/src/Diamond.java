import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ Ȧ���Է�=");
		int max = scan.nextInt();
		// Ȧ���� �ƴϸ� Ȧ���� ��ȯ
		max = (max%2==0)? max+1 : max;
		
		int step = 2;
		char txt = 'A';
		for(int i=1; i>=1; i+= step) {//���ٿ� ����� ���ڼ�
			//����
			for(int space=1; space<=(max-i)/2;space++) {
				System.out.print(" ");
			}
			//����
			for(int cnt=1; cnt<=i; cnt++) {
				System.out.print(txt++);
				if(txt>'Z') {
					txt = 'A';
				}
			}
			System.out.println();
			if(max<=i) {step=-2;}
		}
		
		
	}
}
