package java01_basic;

import java.util.Scanner;

public class ArrayScore {

	public static void main(String[] args) {
		
		do {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("학생수=");
			int cnt = Integer.parseInt(scan.nextLine());
			
			String msg[] = {"국어","영어","수학","총점","평균","석차"};
			String names[] = new String[cnt];
			int jumsu[][] = new int[cnt+2][6];
					
			//데이터 준비
			for(int i=0; i<cnt; i++) {
				System.out.print("학생이름=");
				names[i] = scan.nextLine();
				
				for(int j=0; j<=2; j++) { //0,1,2
				System.out.print(msg[j]+"=");
				jumsu[i][j] = Integer.parseInt(scan.nextLine());
				}
			}
			//개인별총점, 평균, 과목별 총점
			
			for(int i=0; i<cnt; i++) {
				for(int j=0; j<=2; j++) {
					//개인별총점,
					jumsu[i][3] += jumsu[i][j]; // 총점
					//과목별 총점
					jumsu[cnt][j] += jumsu[i][j];
				}
				//개인별 평균
				jumsu[i][4] += jumsu[i][3]/3;
			}
			//과목별 평균
			for(int c=0;c<=2;c++) {
				jumsu[cnt+1][c] = jumsu[cnt][c]/cnt; 
			}
			
			// 석차 구학
			for(int r=0; r<cnt; r++) {// c=0,1,2,3,4
				for(int c=0; c<cnt; c++) {
					//     나          상대방총점
					if(jumsu[r][3] < jumsu[c][3]) {
						jumsu[r][5] +=1;
					}
				}
				jumsu[r][5] +=1;
			}
			// 석차순 정렬
			for(int r=0; r<cnt-1; r++) {
				for(int r2=1; r2<cnt-2; r2++) {
					if(jumsu[r2][5] > jumsu[r2+1][5]) {
						
						// 데이터 교한
						
						//1.이름
						String temp = names[r2];
						names[r2] = names[r2+1];
						names[r2+1] = temp;
						
						//2.성적 교환
						for(int c=0; c<jumsu[r2].length; c++) {
							int tempInt = jumsu[r2][c];
							jumsu[r2][c] = jumsu[r2+1][c];
							jumsu[r2+1][c] = tempInt;
						}
					}
				}
			}
			
			
			// 출력 //
			System.out.print("이름"+"\t");
			for (int i=0; i<msg.length; i++) {
				System.out.print(msg[i]+"\t");
			}
			System.out.println();
			
			for(int z=0;z<jumsu.length;z++) { //행-> 0,1,2,3,4,5
				if(z<cnt) {//이름
					System.out.print(names[z]+"\t");
				}else if(z==cnt){//총점
					System.out.print("총점\t");
				}else if(z==cnt+1) {//평균
					System.out.print("평균\t");
				}
				//점수
				for(int c=0; c<jumsu[z].length; c++) {
					System.out.print(jumsu[z][c]+"\t");
				}
				System.out.println();
			}
			
			System.out.printf("아무키나 눌러주세요");
			String go = scan.nextLine();
			
		}while(true);
		
		
	}
}
