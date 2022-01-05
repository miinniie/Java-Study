// Class
//	대문자시작
//	숫자, &,_ 가능
//	합성이 일때 각 단어의 첫글자는 대문자 (프로그래 만드는 사람들 끼리의 약속)

public class Operator01 { //접근 제한자

	public static void main(String[] args) {
		
		int result = 5/2; // 데이터형 반드시 지정
		// 변수 : 값을 보관하는 이름
		//		소문자로 시작, &,_를 제외한 특수문자는 사용할 수 없다.
		// 		합성어일때 2번쨰 단어의 첫글자를 대문자로 표시
		//		256글자 까지 헝용
		// 		숫자를 사용할 수 있으나 첫번째 문자로 사용할 수 없다.
		
		// 데이터형:
		// 정수: byte(1byte), short(2byte), int(4byte:기본형), long(8byte) >> 메모리(용량)의 차이
		byte result2 = 5*3;
		byte result3 = (byte)130; //강제 형변환 (원래 128까지인 byte를 상제 형변환 하면은 변환은 하나 숫자가 틀림)
		
		// 문자형: 2byte
		String name ="홍길동"; //자바는 string은 반드시 더블 다운표
		char firstName = '['; //자바 변수는 반드시 싱글 다운표
		firstName++; //변수는 아스키 코드 기준으로 정렬하고 연산함
		
		//실수: float(4byte), double(8byte:기본형) > 공간이 정수보다 훨씬큼
		double var = 12.51;
		int intData = (int)var; // 더 큰 데이터를 작은 공간으로 넣을떄는 형변환이 필수
		double var2 = result2;  // 더 작은 데이터를 큰 공간에 넣을때는 형변환이 필요 없음
		firstName++; //변수는 아스키 코드 기준으로 정렬하고 연산함
		
		// 논리형: 1byte
		boolean boo = true;
		boolean boo2 = 5>3;
		
		System.out.println(boo); 
		System.out.println(); //syso
		
	}

}
