
public class ArrayQuestion {

	public static void main(String[] args) {
		
		int num[][] = new int[15][15];
		
		for(int r=0; r<num.length-1 ; r++) {
			for (int c=0; c<num.length-1 ; c++) {
				num[r][c] = (r+1)*(c+1);
				
				//행의합
				num[r][num.length-1] += num[r][c];
						
				//열의합
				num[num.length-1][c] += num[r][c];
			}
		}
		
//		
//		for(int r_count=0; r_count<num.length-1 ; r_count++) {
//			int c_sum = 0;
//			for(int c_count=0; c_count<num.length-1 ; c_count++) {
//				c_sum += num[c_count][r_count];
//				num[9][r_count] = c_sum;
//			}
//		}
//		
//		for(int r_count=0; r_count<num.length-1 ; r_count++) {
//			int r_sum = 0;		
//			for(int c_count=0; c_count<num.length-1 ; c_count++) {
//				r_sum += num[c_count][r_count];
//				num[r_count][9] = r_sum;
//			}
//		}
//			
		
		for(int r=0; r<num.length ; r++) {
			for(int c=0; c<num[r].length; c++) {
				System.out.print(num[r][c]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
