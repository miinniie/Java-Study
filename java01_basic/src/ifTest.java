import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		// 콘솔에서 숫자를 입력받아 양수이면 100배를 하여 출력하라
		
		System.out.print("정수=");
		int inData = scan.nextInt();
		
		if (1<inData && inData<100) {
			int result = inData*100;
			System.out.printf("%d*100 = %d\n", inData, result);
		}	
		System.out.printf("end.....");
	}
}
