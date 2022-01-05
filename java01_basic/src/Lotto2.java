import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
	
		do {
			System.out.printf("게임수=");
			int gameCount = scan.nextInt();
			
			//게임수 만큼 반복
			for(int cnt=1; cnt<=gameCount ; cnt++) {
				//한게임
				//생성
				int lotto[] = new int[7];
				for(int i=0; i<7; i++) {
					lotto[i] = random.nextInt(45)+1;
					
					//지금까지 만들어진 번호와 중복검사
					for(int check=0; check<i ; check++) {
						if(lotto[i]==lotto[check]) {
							i--;
						}
					}
				}
				//정렬
				for(int idx=0; idx<lotto.length-2 ;idx++) { // 마지막에 생성된 보너스 번호 정렬에서 제외
					for(int j=0; j<lotto.length-2-idx; j++) {
						if(lotto[j] > lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1]= temp;
						}
					}
				}
				
				//출력
				
				System.out.printf("%d게임=[", cnt);
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
		
		
			System.out.print("계속하시겠습니까?(1:예, 2:아니오)");
			int again = scan.nextInt();
			if(again==2) {
				break;
			}
			//계속여부 확인			
			
		}while(true);
		
		
		
		
	}
}
