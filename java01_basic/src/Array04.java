
public class Array04 {

	public static void main(String[] args) {
		//2���� �迭�� �ʱ갪 �����ϱ�
		
		int num[][] = new int[][]{{3,7,2,634,3},
					   {53,3,5,6,76},
					   {65,43,36,43,6}};
		
		for(int r=0; r<num.length ; r++) {
			for(int c=0; c<num[r].length; c++) {
				System.out.print(num[r][c]+"\t");
			}
			System.out.println();
		}
		
	}
}
