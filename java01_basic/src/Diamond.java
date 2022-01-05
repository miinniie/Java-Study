import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 홀수입력=");
		int max = scan.nextInt();
		// 홀수가 아니면 홀수로 변환
		max = (max%2==0)? max+1 : max;
		
		int step = 2;
		char txt = 'A';
		for(int i=1; i>=1; i+= step) {//한줄에 출력할 문자수
			//공백
			for(int space=1; space<=(max-i)/2;space++) {
				System.out.print(" ");
			}
			//문자
			for(int cnt=1; cnt<=i; cnt++) {
				System.out.print(txt++);
				if(txt>'Z') {
					txt = 'A';
				}
			}
			System.out.println();
			if(max<=i) {step=-2;}
		}
		
		
	}
}
