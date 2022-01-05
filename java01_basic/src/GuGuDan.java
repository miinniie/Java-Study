
public class GuGuDan {

	public static void main(String[] args) {
		for(int i=1; i<=9;i+=3) {
			//단 타이틀
			for(int head=i;head<i+3;head++) {
				System.out.print(head+"단\t");
			}
			System.out.println();
			
			//구구단
			for(int x=2; x<=9 ; x++) {
				for(int dan=i; dan<i+3; dan++) {
					int result = dan*x;
					System.out.print(dan+"*"+x+"="+result+"\t");
				}
				System.out.println();
			}
		}
		
		
	}
}
