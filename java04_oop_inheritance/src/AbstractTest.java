//추상클래스는 추상메소드를 1개 이상 포함하고 있는 클래스
//추상메소드 메소드명과 반환이 정해지고 실행부는 없는 메소드를 말한다
//추상클래스는 객체를 생성할 수 없으며, 반드시 상속받아서 추상메소드를 오버라이딩 해주어야한다.
//추상메소드는 반환형 왼쪽에 abstract를 표기
//추상클래스 class 키워드 왼쪽에 abstract 표기하여야한다.

public abstract class AbstractTest { //추상메소드를 가지고 있기때문에 추상 클래스가됨
	int data = 200;
	
	//생성자 메소드
	public AbstractTest() {}
	
		//합 > 추상메소드로 만들기 (반환형 왼쪽에 abstract 키워드 표기하여야 한다.)
		public abstract int add(int n1, int n2);
	
		//차
		public void minus(int n1, int n2) {
			int result = n1-n2;
			output(n1,n2,result,"-");
		}
		
		//곱 > 추상메소드로 만들기
		public abstract int multiple(int n1, int n2);
		
		//몫
		public void divide(int n1, int n2) {
			int result = n1/n2;
			output(n1,n2,result,"/");
		}
		
		public void output(int n1, int n2, int result, String operator) {
			System.out.printf("%d %s %d = %d\n", n1,operator,n2,result);
		}
		
		
}
