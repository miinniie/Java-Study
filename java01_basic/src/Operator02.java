import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		// 실행중 콘솔에서 정수를 입력받아 홀수/짝수를 구별하여 출력하라.
		/*
		 실행 결과
		 양의 정수 입력 = 243
		 243은 홀수 입니다.
		 */
		
		Scanner s =new Scanner(System.in);
		System.out.print("양의 정수 입력=");
		int data = s.nextInt();
		
		String result = (data%2==0)? "짝수": "홀수"; // 삼항연산자
		
		System.out.println(data + "은 "+ result + "입니다");
		
//		if (data%2==1) {
//			System.out.println(data + "은 홀수입니다");
//		}else {
//			System.out.println(data + "은 짝수입니다");
//		}
		
	}

}
