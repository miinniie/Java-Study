import java.util.Random;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class NumberMatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		
		int ranInt = ran.nextInt(100)+1; //���� ����
		int cnt = 0;
		do {
			do {
				System.out.print("1~100������ �� �Է�=");
				int inData = Integer.parseInt(scan.nextLine());
				cnt++;//���� Ƚ��
	
				if(ranInt > inData) {
					System.out.println("�� ū���Դϴ�.");
				}else if(ranInt < inData) {
					System.out.println("�� �������Դϴ�");
				}else {
					System.out.println(cnt+"��°���� ���߼̽��ϴ�.");
					break;
				}
			}while(true);
			//����Ȯ��
			System.out.print("����Ͻðڽ��ϱ�(��:y/Y, �ƴϿ�:n/N)?");
			String que = scan.nextLine();
			// ��ҹ��� �������� ������ �ٸ����� ���Ѵ�.
			if (!que.equalsIgnoreCase("y")) {
				break;
			}
					
		}while(true);

	}
}
