import java.util.Scanner;

public class ForEx2Diamond2 {
	public static void main(String[] args) {
		
		System.out.print("임의의 홀수입력(1~49)=");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		char letter[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
		int step =2;
		int start_idx =1;
		
		for (int i=1;i>=1;i+=step) {
			for (int s=1;s<=(num-i)/2;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(letter[(start_idx-1)%letter.length]);
				start_idx += 1;
			}
			System.out.println();
			if(i>=num) {
				step=-2;
			}
		}
		
		
	}
}
