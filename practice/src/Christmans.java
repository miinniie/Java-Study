import java.util.Scanner;

public class Christmans {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("'�޸�ũ��������'�� �Է����ּ���=");
		String check = scan.nextLine();
				
		
		int num = 30;
		int step = 2;
		
		System.out.println();
		System.out.println("        MERRY CHRISTMAS!");
		System.out.println();
	
		
		//Ʈ��
		int i = 1;
		while(i<num) {
			//����
			for(int space=1; space<=(num-i)/2;space++) {
				System.out.print(" ");
			}
			//�μ�
			for(int cnt=1; cnt<=i; cnt++) {
				System.out.print("*");
			}
			System.out.println();

			
			if(i==num-1) {
				break;
			}
			if(i%5==0) {
				i = i-2;
			}
			
			i+= step;
		}

		
//		for(int i=1; i<num; i+= step) {//���ٿ� ����� ���ڼ�
			
//			if(i%5==0) {
//				i = i-2;
//			}
//			
//			//����
//			for(int space=1; space<=(num-i)/2;space++) {
//				System.out.print(" ");
//			}
//			//�μ�
//			for(int cnt=1; cnt<=i; cnt++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//���� ���
//		for(int trunk=0; trunk<=1; trunk++) {
//			for(int trunk_blk=0; trunk_blk <num/3+1; trunk_blk++) {
//				System.out.print(" ");
//			}
//			System.out.println("*****");
//		}
		
		
	}
}
