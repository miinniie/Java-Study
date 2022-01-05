

import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1~100 사이의 난수를 만들어
		// 합, 평균, 최댓갓, 최솟값을 구하라.
		
		System.out.printf("배열의 크기=");
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
		
		//계산하기
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
		
		System.out.println("실행결과");
		System.out.printf("합=%d\n", total);
		System.out.printf("평균=%d\n",average);
		System.out.printf("최댓값=%d\n",maximum);
		System.out.printf("최솟값=%d\n",minimun);
	}

}
