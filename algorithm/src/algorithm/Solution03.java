package algorithm;

import java.util.Scanner;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh

public class Solution03{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=1; i<=T; i++) {
			int tn = scan.nextInt();
			int array[] = new int[101]; //�ε����� üũ�ϱ�
			
			for(int j=1; j<=1000; j++) {
				int score = scan.nextInt();
				array[score]+=1;
			}
			
			int max = 0; //�ʱⰪ (�ֺ� ��ȣ)
			int answer = 0; //�ֺ�
			for(int check=0; check<=100; check++) {
				if(max<=array[check]){
					max = array[check];
					answer = check;
				}
				
			}
			System.out.printf("#%d %d\n", tn, answer);
		}
	}

}
