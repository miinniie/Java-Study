import java.util.Scanner;

public class MoneyCount2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하세요?=");
		int money = s.nextInt();
		
		final int W50000 = 50000
				
		for (i=10000, i)
		
		//50000
		int c50000 = money/W50000;
		
		money -= c50000 *W50000; //50000원 금액만큼 빼주기
		
		//10000
		int c10000 = money/10000;
		
		money -= c10000*10000;
		
		//5000
		int c5000 = money/5000;
		
		money -= c5000*5000;
		
		//1000
		int c1000 = money/1000;
		
		money -=c1000*1000;
		
		//500
		int c500 = money/500;
		
		money -=c500*500;
		
		//100
		int c100 = moeny/100;
		
		money -= c100*100;
		
		
	}

}
