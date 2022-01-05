package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {
	
	//스위치 상태를 저장할 배열을 선언
	static int swi[];
	
	//남자일때 스위치 조작
	public static void man(int n) {
		for(int i=n; i<swi.length; i+=n) { //<9   3, 6
			//3, 6위치의 스위치를 변경한다.
			//if(swi[n]==0) {swi[n]=1;}
			//else {swi[n]=0;}
			swi[i] ^= 1;
		}
	}
	//[0, 0, 1, 1, 1, 0, 1, 0, 1] 3 > 2(이전위치),4(다음위치)
	public static void woman(int n) {
		int left = n-1; //이전 위치: 2
		int right = n+1; //다음 위치: 4
		
		while(true) {
			if(left<1 || right>=swi.length) break; //스위치의 범위를 벗어났을때 왼쪽
			if(swi[left] != swi[right]) break; //왼쪽과 오른쪽 스위치가 대칭인지 확인 
			//대칭+ 스위치도 남아있고
			left--;
			right++;
		}
		//스위치 교환
		for(int s=left+1; s<= right-1; s++) { //1 2,3,4,5
			swi[s] ^= 1;
		}
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sCnt = scan.nextInt(); //스위치의 갯수를 입력
		
		//배열을 생성한다
		swi = new int[sCnt+1]; //8-> 0,1,2,3,4,5,6,7,8
		
		//배열에 각 스위치 상태를 저장한다
		for(int i=1; i<=sCnt; i++) {
			swi[i] = scan.nextInt();
		}
		int pCnt = scan.nextInt(); //인원수 -2
		for(int z=1; z<=pCnt; z++) {
			int gender = scan.nextInt();//성별
			int swiPnt = scan.nextInt(); //스위치 위치
			
			if(gender==1) {//남자일때
				man(swiPnt);
			}else if(gender==2){//여자일때
				woman(swiPnt);
			}
		}
		
		for(int i=1; i<swi.length; i++) {
			System.out.print(swi[i]+" ");
			if(i%20==0)System.out.println();
		}
	}		
}