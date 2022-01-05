import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		int randomCount = 7;
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("게임수=");
			int gameNum = scan.nextInt();
			
			for(int cnt=0;cnt<gameNum;cnt++) {
				int lotto[] = new int[45]; //배열의 길이를 45로 두고 뽑는 랜덤값을 0에서 -1로 바꿔줌 + 이후 뽑은 값이 이미 -1(중복)이면 다시 뽑기
				int answer[] = new int[randomCount-1]; //출력을 위해 답을 담은 배열
				int bonus=0; // 보너스
				
				for(int i=0;i<randomCount;i++) {
					while(true) {
						int randNum = ran.nextInt(45) + 1;
						
						//중복 체크
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
				
				// answer배열 버블 정렬
				for(int j=0; j<answer.length-1;j++) {
					for(int i=0; i<answer.length-1-j; i++) {
						if(answer[i]>answer[i+1]) {
							int temp = answer[i];
							answer[i]=answer[i+1];
							answer[i+1]=temp;
						}
					}
				}
				
				//형식에 맞춰서 answer 배열 순회하며 출력
				System.out.printf("%d게임=[", cnt + 1);
				for(int i=0;i<answer.length-1;i++) {
					System.out.printf("%d, ", answer[i]);
				}
				System.out.printf("%d], bonus=%d\n", answer[answer.length-1], bonus);	
			}
			
			//다시할지 묻기
			System.out.print("계속 하시겠습니까(1.예, 2:아니요)?");
			int isFinish = scan.nextInt();
			if (isFinish == 2) {
				break;
			}
		}
	}
}
