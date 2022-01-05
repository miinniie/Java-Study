import java.util.Scanner;

// 1. 정수 두개를 입력 받아 큰 수를 출력하라 
public class Assignment01 {
	public static void main(String[] args) {
		
		// 숫자1,숫자2 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1=");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2=");
		int num2 = scan.nextInt();
		
		//더 큰 수 출력
		int answer = num1; //디폴트가 num1 
		
		if(num2>num1) {
			answer = num2;
			System.out.println("큰 수는="+answer);
		}else {
			System.out.println("큰 수는="+answer);
		}
	}

}
