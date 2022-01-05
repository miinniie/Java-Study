import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("게임수=");
		int gameNum = scan.nextInt();
			
		for(int cnt=0; cnt<gameNum; cnt++) {
			
			//1~45까지 있는 배열 만들기
			int lotto[] = new int[45];
			for (int i=0; i<45; i++) {
				lotto[i] = i+1;
			}
			
			System.out.printf("\n%d게임=[", cnt+1);
			int drawNum = 44;
					
			for(int j=0; j<=6;j++) {
				int randNum = ran.nextInt(drawNum);
				System.out.print(lotto[randNum+1]+" ");
				lotto.indexOf[randNum]
				
				drawNum --;
			}
			
			if(cnt==gameNum) {
				break;
			}
		}
			
			
			
			
			
			
//			System.out.println("\n계속 하시겠습니까(1.예, 2:아니요)?");
//			int isFinish = scan.nextInt();
//			if (isFinish == 1) {
//				System.out.println("\n");
//			} else if(isFinish == 2) {
//				break;
//			}
//		}
			
			
	}
}
