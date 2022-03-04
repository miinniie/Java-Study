import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner클래스를 이용하여 콘솔에서 데이터 입력 받을 경우
		//new : Scanner클래스를 객체로 생성한다.
		//레퍼런스 변수/인스턴스 (ex.scanner변수): class 로 선언된 변수 <-> 기본형 변수 (ex. int, double...) 
		Scanner scan =new Scanner(System.in);
		// nextInt() : 메소드 호출, 콘솔에서 문자를 입력받아 정수(int형)로 변환하여 주는 메소드
		System.out.print("정수=");
		int num = scan.nextInt()*10;

		System.out.println("num=" + num);
	}

}
