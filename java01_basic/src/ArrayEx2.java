

import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1~100 ������ ������ �����
		// ��, ���, �ִ�, �ּڰ��� ���϶�.
		
		System.out.printf("�迭�� ũ��=");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		int num[] = new int[count];

		for(int i=0; i<count; i++) {
			int ran = (int)(Math.random()*count+1);
			num[i] = ran;
		}
		
		int total = 0;
		int maximum = num[0];
		int minimun = num[0];
		
		//����ϱ�
		for(int j=0; j<count; j++) {
			total += num[j];
			if (maximum<num[j]) {
				maximum = num[j];
			}
			if (minimun>num[j]) {
				minimun = num[j];
			} 
		}
		
		int average = total/num.length;
		
		System.out.println("������");
		System.out.printf("��=%d\n", total);
		System.out.printf("���=%d\n",average);
		System.out.printf("�ִ�=%d\n",maximum);
		System.out.printf("�ּڰ�=%d\n",minimun);
	}

}
