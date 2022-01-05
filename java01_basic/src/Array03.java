import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("금액=");
		int money = Integer.parseInt(s.nextLine());
		
		// 배열을 이용하여 화폐 단위 계산
		
		int won[] = {50000, 10000, 5000, 1000, 500, 100, 50 ,10 ,5, 1};
		for(int w: won) {
			int cnt = money/w;
			if(cnt>0) {
				System.out.print(w+"원->"+cnt);
				String danwi = "개";
				if (w>=1000) {
					danwi = "장";
				}
				System.out.println(danwi);
			}
			money -= w*cnt;
			
		}
		
		
	}
}
