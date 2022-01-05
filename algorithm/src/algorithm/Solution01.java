package algorithm;

import java.util.Scanner;

public class Solution01 {
	/*
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	int num1 = scan.nextInt();
    	
        for( int i=1; i<=num1; i++ ) {
            int sum = 0;
            for( int j=0; j<10; j++ ) {
             	int num2 = scan.nextInt();
                if( num2%2 == 1 ) sum+=num2;
            }
            System.out.format("#%d %d\n", i, sum);
        }
    }
    */
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//문제수
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=1; i<=cnt; i++) {
			//데이터를 문자열로 입력받아 배열로 변경
			String inData[] = scan.nextLine().split(" ");
			//계산하기
			int result = 0;
			for(int idx=0; idx<inData.length; idx++) {
				int d = Integer.parseInt(inData[idx]);
				if(d%2==1) {
					result += d;
				}
			}
			System.out.println("#"+i+" "+result);
		}
	}
}

