
public class MathRandom {

	public static void main(String[] args) {
		//���� �����
		
		for(int i=1; i<=100; i++) {
			// Ư�� ������ ���� ����: Math.random*(������ ū�� - ������ ������ + 1)(����ȭ) + ������ ������
			int ran = (int)(Math.random()*47+1); //Math.random(1~9)�� ���ϱ⸦ ������
			System.out.printf("%10d",ran);
			if(i%5==0) {
				System.out.println();
			}
			
			
		}
		
		int lotto[] = new int[6];
		System.out.println(lotto.indexOf(2));
	}

}
