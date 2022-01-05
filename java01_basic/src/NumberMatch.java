import java.util.Random;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class NumberMatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		
		int ranInt = ran.nextInt(100)+1; //난수 생성
		int cnt = 0;
		do {
			do {
				System.out.print("1~100사이의 수 입력=");
				int inData = Integer.parseInt(scan.nextLine());
				cnt++;//맞춘 횟수
	
				if(ranInt > inData) {
					System.out.println("더 큰수입니다.");
				}else if(ranInt < inData) {
					System.out.println("더 작은수입니다");
				}else {
					System.out.println(cnt+"번째만에 맞추셨습니다.");
					break;
				}
			}while(true);
			//종료확인
			System.out.print("계속하시겠습니까(예:y/Y, 아니오:n/N)?");
			String que = scan.nextLine();
			// 대소문자 구별없이 같은지 다른지를 구한다.
			if (!que.equalsIgnoreCase("y")) {
				break;
			}
					
		}while(true);

	}
}
