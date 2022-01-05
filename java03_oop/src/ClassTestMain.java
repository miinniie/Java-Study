import sawon.ClassTest;

public class ClassTestMain {

	public static void main(String[] args) {
		//생성자 메소드의 종류만큼 객체를 생성하는 방법이 생긴다.
		ClassTest ct = new ClassTest(100, "홍길동"); //ClassTest(int)
		//메소드 호출
		//객체.메소드명()
		ct.sum();
		int result = ct.total(150);
		System.out.println(result);
	}
}
