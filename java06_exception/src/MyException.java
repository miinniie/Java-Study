//사용자 정의 예외처리 클래스 만들기

//조건1. Exception (인터페이스가 아니라 클래스임)상속
public class MyException extends Exception {
	MyException(){
		//상위 클래스인 Exception의 생성자 메소드를 호출하여
		//예외 메세지를 설정한다.
		super("1~100사이의 값이 아니다.");
	}
	public MyException(String message) {
		super(message);
	}
	
}
