import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.printf("���Ӽ�=");
			int gameCount = scan.nextInt();
			
			//���Ӽ� ��ŭ �ݺ�
			for(int cnt=1; cnt<=gameCount ; cnt++) {
				//�Ѱ���
				TreeSet<Integer> ts = new TreeSet<Integer>();
				//���� ����
				//�������� ������ ��ȣ�� ����ϱ� ���� ���� = ���ʽ� ��ȣ�� �ȴ�
				int lastLottoNum=0;
				while(6>=ts.size()) {
					lastLottoNum = random.nextInt(45)+1;
					ts.add(lastLottoNum);
				}
				//TreeSet�� ���ʽ� ��ȣ�� ��ġ�ϴ� ��ȣ�� �����.
				ts.remove(lastLottoNum);
				
				//���
				System.out.print(cnt+"����=[");
				Iterator<Integer> lottoNum = ts.iterator();
				int i=0;
				while(lottoNum.hasNext()) {
					i++;
					System.out.print(lottoNum.next());
					if(i==6) {
						System.out.println("], bonus="+lastLottoNum);
					}else {
						System.out.print(", ");
					}
				}
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