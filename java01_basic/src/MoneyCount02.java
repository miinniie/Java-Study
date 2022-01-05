import java.util.Scanner;

public class MoneyCount02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요=?");
		int money = scan.nextInt();
		int div = 5;
		int won = 50000;
		
		for(;money>0;) {
			int cnt = money/won;
			if(cnt>0) {
				System.out.print(won+"->"+cnt);
				if(won>=1000) {
					System.out.println("장");
				}else {
					System.out.println("개");
				}
			}
			money -= cnt*won;
			won = won /div; // 다음화폐만들기
			
			if(div==5)div=2;
			else div=5;
		}
	}
}
