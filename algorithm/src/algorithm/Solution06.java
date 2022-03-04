package algorithm;

//http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=2070&sca=2010&sfl=wr_hit&stx=1304
import java.util.Scanner;

public class Solution06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int arr[][] = new int[num][num];
		
		int temp = 1;
		
		for(int c=0; c<arr[0].length; c++) { //¿­ idx 0,1,2,3,4
			for(int r=0; r<arr.length; r++) {
				arr[r][c] = temp++;
			}
		}
		//Ãâ·Â
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
