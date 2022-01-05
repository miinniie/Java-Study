package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {
	
	//����ġ ���¸� ������ �迭�� ����
	static int swi[];
	
	//�����϶� ����ġ ����
	public static void man(int n) {
		for(int i=n; i<swi.length; i+=n) { //<9   3, 6
			//3, 6��ġ�� ����ġ�� �����Ѵ�.
			//if(swi[n]==0) {swi[n]=1;}
			//else {swi[n]=0;}
			swi[i] ^= 1;
		}
	}
	//[0, 0, 1, 1, 1, 0, 1, 0, 1] 3 > 2(������ġ),4(������ġ)
	public static void woman(int n) {
		int left = n-1; //���� ��ġ: 2
		int right = n+1; //���� ��ġ: 4
		
		while(true) {
			if(left<1 || right>=swi.length) break; //����ġ�� ������ ������� ����
			if(swi[left] != swi[right]) break; //���ʰ� ������ ����ġ�� ��Ī���� Ȯ�� 
			//��Ī+ ����ġ�� �����ְ�
			left--;
			right++;
		}
		//����ġ ��ȯ
		for(int s=left+1; s<= right-1; s++) { //1 2,3,4,5
			swi[s] ^= 1;
		}
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sCnt = scan.nextInt(); //����ġ�� ������ �Է�
		
		//�迭�� �����Ѵ�
		swi = new int[sCnt+1]; //8-> 0,1,2,3,4,5,6,7,8
		
		//�迭�� �� ����ġ ���¸� �����Ѵ�
		for(int i=1; i<=sCnt; i++) {
			swi[i] = scan.nextInt();
		}
		int pCnt = scan.nextInt(); //�ο��� -2
		for(int z=1; z<=pCnt; z++) {
			int gender = scan.nextInt();//����
			int swiPnt = scan.nextInt(); //����ġ ��ġ
			
			if(gender==1) {//�����϶�
				man(swiPnt);
			}else if(gender==2){//�����϶�
				woman(swiPnt);
			}
		}
		
		for(int i=1; i<swi.length; i++) {
			System.out.print(swi[i]+" ");
			if(i%20==0)System.out.println();
		}
	}		
}