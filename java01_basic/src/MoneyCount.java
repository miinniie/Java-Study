import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하세요?=");
		int money = s.nextInt();
		int change1; //50000
		int change2; //10000
		int change3; //5000
		int change4; //1000
		int change5; //500
		int change6; //100
		int change7; //50
		int change8; //10
		int change9; //1
		
		// 화폐별 갯수
		change1 = money/50000;
		change2 = money%50000/10000;
		change3 = money%10000/5000;
		change4 = money%5000/1000;
		change5 = money%1000/500;
		change6 = money%500/100;
		change7 = money%100/50;
		change8 = money%50/10;
		change9 = money%10;
		
		//화페가 1개 이상일때만 출력 (0개는 출력하지 않음)
		if(change1!=0) {
			System.out.println("50000원="+change1+"장");
		}
		if(change2!=0) {
			System.out.println("10000원="+change2+"장");
		}
		if(change3!=0) {
			System.out.println("5000원="+change3+"장");
		}
		if(change4!=0) {
			System.out.println("1000원="+change4+"장");
		}
		if(change5!=0) {
			System.out.println("500원="+change5+"개");
		}
		if(change6!=0) {
			System.out.println("100원="+change6+"개");
		}
		if(change7!=0) {
			System.out.println("50원="+change7+"개");
		}
		if(change8!=0) {
			System.out.println("10원="+change8+"개");
		}
		if(change9!=0) {
			System.out.println("1원="+change9+"개");
		}
		
		
	}

}
