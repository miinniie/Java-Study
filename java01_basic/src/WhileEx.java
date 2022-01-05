import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		System.out.printf("정수입력=");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		int total = 0;
		int odd = 0;
		int even = 0;

		int i = 0;
		while (i < 100) {
			i++;
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			total += i;
		}

		System.out.printf("1~100까지의 합은 %d\n", total);
		System.out.printf("1~100까지의 홀수의 합은 %d\n", odd);
		System.out.printf("1~100까지의 짝수의 합은 %d\n", even);

	}

}
