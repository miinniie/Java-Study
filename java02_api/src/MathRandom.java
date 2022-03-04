
public class MathRandom {

	public static void main(String[] args) {
		//난수 만들기
		
		for(int i=1; i<=100; i++) {
			// 특정 범위의 난수 생성: Math.random*(범위의 큰수 - 범위의 작은수 + 1)(정수화) + 범위의 작은수
			int ran = (int)(Math.random()*47+1); //Math.random(1~9)에 곱하기를 먼저함
			System.out.printf("%10d",ran);
			if(i%5==0) {
				System.out.println();
			}
			
			
		}
		
		int lotto[] = new int[6];
		System.out.println(lotto.indexOf(2));
	}

}
