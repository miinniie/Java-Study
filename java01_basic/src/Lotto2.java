import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
	
		do {
			System.out.printf("���Ӽ�=");
			int gameCount = scan.nextInt();
			
			//���Ӽ� ��ŭ �ݺ�
			for(int cnt=1; cnt<=gameCount ; cnt++) {
				//�Ѱ���
				//����
				int lotto[] = new int[7];
				for(int i=0; i<7; i++) {
					lotto[i] = random.nextInt(45)+1;
					
					//���ݱ��� ������� ��ȣ�� �ߺ��˻�
					for(int check=0; check<i ; check++) {
						if(lotto[i]==lotto[check]) {
							i--;
						}
					}
				}
				//����
				for(int idx=0; idx<lotto.length-2 ;idx++) { // �������� ������ ���ʽ� ��ȣ ���Ŀ��� ����
					for(int j=0; j<lotto.length-2-idx; j++) {
						if(lotto[j] > lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1]= temp;
						}
					}
				}
				
				//���
				
				System.out.printf("%d����=[", cnt);
				for (int i = 0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]);
					if (i<5) {
						System.out.print(", ");
					}else {
						System.out.print("], ");
					}	
				}
				System.out.println("bonus="+ lotto[6]);
			}
		
		
			System.out.print("����Ͻðڽ��ϱ�?(1:��, 2:�ƴϿ�)");
			int again = scan.nextInt();
			if(again==2) {
				break;
			}
			//��ӿ��� Ȯ��			
			
		}while(true);
		
		
		
		
	}
}
