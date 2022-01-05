import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int randomCount = 7;
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���Ӽ�=");
			int gameNum = scan.nextInt();
			
			for(int cnt=0;cnt<gameNum;cnt++) {
				int lotto[] = new int[45]; //�迭�� ���̸� 45�� �ΰ� �̴� �������� 0���� -1�� �ٲ��� + ���� ���� ���� �̹� -1(�ߺ�)�̸� �ٽ� �̱�
				int answer[] = new int[randomCount-1]; //����� ���� ���� ���� �迭
				int bonus=0; // ���ʽ�
				
				for(int i=0;i<randomCount;i++) {
					while(true) {
						int randNum = ran.nextInt(45) + 1;
						
						//�ߺ� üũ
						if (lotto[randNum-1] == 0) {
							lotto[randNum-1] = -1;
							
							if (i == randomCount-1) {
								bonus = randNum;
							} else {
								answer[i] = randNum;
							}
							break;
						}
					}
				}
				
				// answer�迭 ���� ����
				for(int j=0; j<answer.length-1;j++) {
					for(int i=0; i<answer.length-1-j; i++) {
						if(answer[i]>answer[i+1]) {
							int temp = answer[i];
							answer[i]=answer[i+1];
							answer[i+1]=temp;
						}
					}
				}
				
				//���Ŀ� ���缭 answer �迭 ��ȸ�ϸ� ���
				System.out.printf("%d����=[", cnt + 1);
				for(int i=0;i<answer.length-1;i++) {
					System.out.printf("%d, ", answer[i]);
				}
				System.out.printf("%d], bonus=%d\n", answer[answer.length-1], bonus);	
			}
			
			//�ٽ����� ����
			System.out.print("��� �Ͻðڽ��ϱ�(1.��, 2:�ƴϿ�)?");
			int isFinish = scan.nextInt();
			if (isFinish == 2) {
				break;
			}
		}
	}
}
