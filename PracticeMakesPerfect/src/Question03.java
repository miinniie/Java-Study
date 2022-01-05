import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("임의의수=");
		
		int num = scan.nextInt();
		int even = 0;
		int odd = 0;
		int third = 0;
		
		for(int i=1; i<num+1; i++) {
			if(i%2==0) {
				even += i;
			}else{
				odd+=i;
			}
			if(i%3==0) {
				third += i;
			}
		}
		
		System.out.printf("짝수의 합=%d\n홀수의 합=%d\n3의 배수의 합=%d\n", even, odd, third);

		
		
		
		
	}
}
