import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ���?=");
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
		
		// ȭ�� ����
		change1 = money/50000;
		change2 = money%50000/10000;
		change3 = money%10000/5000;
		change4 = money%5000/1000;
		change5 = money%1000/500;
		change6 = money%500/100;
		change7 = money%100/50;
		change8 = money%50/10;
		change9 = money%10;
		
		//ȭ�䰡 1�� �̻��϶��� ��� (0���� ������� ����)
		if(change1!=0) {
			System.out.println("50000��="+change1+"��");
		}
		if(change2!=0) {
			System.out.println("10000��="+change2+"��");
		}
		if(change3!=0) {
			System.out.println("5000��="+change3+"��");
		}
		if(change4!=0) {
			System.out.println("1000��="+change4+"��");
		}
		if(change5!=0) {
			System.out.println("500��="+change5+"��");
		}
		if(change6!=0) {
			System.out.println("100��="+change6+"��");
		}
		if(change7!=0) {
			System.out.println("50��="+change7+"��");
		}
		if(change8!=0) {
			System.out.println("10��="+change8+"��");
		}
		if(change9!=0) {
			System.out.println("1��="+change9+"��");
		}
		
		
	}

}
