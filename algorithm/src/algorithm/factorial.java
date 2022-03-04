package algorithm;

import java.util.Scanner;

public class factorial {

	public static void number1(int num) {
		int resultData=1;
		for (int idx=num; idx>0; idx--) {//5,4,3,2,1..
			resultData *= idx;
		}
		System.out.println(resultData);
	}
	//반복문을 이용하여 팩토리얼 구하기
	public static void test1(int n) {
		// 5 > 5*4*3*2*1 / 1*2*3*4*5
		int res = 1;
		for(int i=n; i>=1; i--) {
			res *= i;
		}
		System.out.println(res);
	}
	
	//재귀호출를 이용하여 팩토리얼 구하기: 반환형이 없는 방법
	//곱한 결과를 저장할 static변수 정의
	static int result = 1;
	public static void test2(int n) {
		//n이 0일때 재귀호출을 중단한다.
		if(n==0) return; //현재 메소드 중단..
		
		result *= n;
		test2(n-1); //재귀호출
	}
	
	public static int test3(int n) {
		return n * test3(n-1);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		number1(num);
		test1(num);
		test2(num);
		System.out.println(result);
		int pResult = test3(num);
		System.out.println(pResult);
	}
}
