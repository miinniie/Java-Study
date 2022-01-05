import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto4 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.printf("게임수=");
			int gameCount = scan.nextInt();
			
			//게임수 만큼 반복
			for(int cnt=1; cnt<=gameCount ; cnt++) {
				//한게임
				TreeSet<Integer> ts = new TreeSet<Integer>();
				//난수 생성
				//마지막에 생성된 번호를 기억하기 위한 변수 = 보너스 번호가 된다
				int lastLottoNum=0;
				while(6>=ts.size()) {
					lastLottoNum = random.nextInt(45)+1;
					ts.add(lastLottoNum);
				}
				//TreeSet의 보너스 번호와 일치하는 번호를 지운다.
				ts.remove(lastLottoNum);
				
				//출력
				System.out.print(cnt+"게임=[");
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
		
			System.out.print("계속하시겠습니까?(1:예, 2:아니오)");
			int again = scan.nextInt();
			if(again==2) {
				break;
			}
			//계속여부 확인			
			
		}while(true);
		
		
		
		
	}
}
