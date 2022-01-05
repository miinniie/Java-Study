
public class WhileTest2 {

	public static void main(String[] args) {
		//1~100까지 값중 5를 제외하고 출력하라
		
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
