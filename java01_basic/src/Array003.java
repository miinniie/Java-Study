
public class Array003 {

	public static void main(String[] args) {
		//2차원 배열
		int arr[][] = new int[5][5];
		for (int r = 0; r<arr.length; r++) {
			for(int c = 0; c < arr[r] ; c++) {
				if(r==c || r+c==arr[r].length-1){
				arr[r][c]=100;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("6d%",arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
