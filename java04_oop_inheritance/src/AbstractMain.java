//추상클래스를 상속받으면 모든 추상메소드는 하위클래스에서
//오버라이딩 되어야한다

public class AbstractMain extends AbstractTest {

	//합 추상메소드 오버라이딩
	public int add(int a, int b) { //변수명 변환
		int result = a+b;
		return result;
	}

	public void multiple(int n1, int n2) {
		//실행문
	}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		
		//메소드 호출 (추상메소드 아닌거)
		am.minus(300, 400);
		
		//메소드 호출(추상메소드)
		System.out.println("am.add(8,9)->" + am.add(8, 9));
		
		//추상클래스 객체 생성 >> 객체 안만들어짐
		//추상메소드는 미완성 메소드 이기 때문에 상속받아서 사용하여아한다
		//AbstractTest at = new AbstractTest();
	}
}
