import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ran = (int)(Math.random()*101+1);
		int count = 0;
		
		System.out.print("1~100������ �� �Է�=>");
		int num = Integer.parseInt(s.nextLine());
				
		while (true) {
			count += 1;

			if(ran>num) {
				System.out.println("�� ū���Դϴ�");
			}else if(ran<num) {
				System.out.println("�� �������Դϴ�.");
			}else{
				System.out.println(count+"��°���� ���߼̽��ϴ�.");
				break;
			}
			System.out.print("1~100������ �� �Է�=>");
			num = Integer.parseInt(s.nextLine());
		}
		
		
	}
}
