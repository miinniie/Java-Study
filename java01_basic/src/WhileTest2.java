
public class WhileTest2 {

	public static void main(String[] args) {
		//1~100���� ���� 5�� �����ϰ� ����϶�
		
		int i=1;
		while(i<=100) {
			if(i%5==0) {
				continue;
			}
			i++;
			System.out.println(i);
		}
		
		
		
	}
}
