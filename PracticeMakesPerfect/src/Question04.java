
public class Question04 {

	public static void main(String[] args) {
		String array[][] = new String[5][5];
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(i>j){
					array[i][j] = "0";
				}else {
					array[i][j] = "X";
				}
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
