
public class GuGuDan {

	public static void main(String[] args) {
		for(int i=1; i<=9;i+=3) {
			//�� Ÿ��Ʋ
			for(int head=i;head<i+3;head++) {
				System.out.print(head+"��\t");
			}
			System.out.println();
			
			//������
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
