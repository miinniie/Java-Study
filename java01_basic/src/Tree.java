
public class Tree {

	public static void main(String[] args) {
		
		System.out.println("삼각형(가운데 정렬)");		
		//삼각형
		/*
		 
		   *
		  ***
		 *****
		*******
		 
		 */
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("\n역삼각형(가운데 정렬)");
		//역삼각형
		/*
		 
		*******
		 *****
          ***
           *		
           
		 */
		
		for (int i=5;i>=0;i--) {
			for (int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
