
public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("  마름모");
		//마름모
		/*
		   *
		  ***
		 *****
		*******
	   *********
		*******
		 *****
          ***
           *	 
		 */
		int step =2;
		
		for (int i=1;i>=1;i+=step) {
			for (int s=1;s<=(9-i)/2;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i>=9) {
				step=-2;
			}
		}
		
		
		
		
	}

}
