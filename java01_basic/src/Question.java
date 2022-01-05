import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ran = (int)(Math.random()*101+1);
		int count = 0;
		
		System.out.print("1~100사이의 수 입력=>");
		int num = Integer.parseInt(s.nextLine());
				
		while (true) {
			count += 1;

			if(ran>num) {
				System.out.println("더 큰수입니다");
			}else if(ran<num) {
				System.out.println("더 작은수입니다.");
			}else{
				System.out.println(count+"번째만에 맞추셨습니다.");
				break;
			}
			System.out.print("1~100사이의 수 입력=>");
			num = Integer.parseInt(s.nextLine());
		}
		
		
	}
}
