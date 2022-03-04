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
	//�ݺ����� �̿��Ͽ� ���丮�� ���ϱ�
	public static void test1(int n) {
		// 5 > 5*4*3*2*1 / 1*2*3*4*5
		int res = 1;
		for(int i=n; i>=1; i--) {
			res *= i;
		}
		System.out.println(res);
	}
	
	//���ȣ�⸦ �̿��Ͽ� ���丮�� ���ϱ�: ��ȯ���� ���� ���
	//���� ����� ������ static���� ����
	static int result = 1;
	public static void test2(int n) {
		//n�� 0�϶� ���ȣ���� �ߴ��Ѵ�.
		if(n==0) return; //���� �޼ҵ� �ߴ�..
		
		result *= n;
		test2(n-1); //���ȣ��
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
