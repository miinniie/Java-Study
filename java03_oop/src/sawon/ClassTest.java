package sawon;
//package
//어떤 경우에 패키지 생략 가능?
//>> 루트 클래스면은 상관없음

//package aaa;

import java.util.Scanner;
import java.util.Calendar;
//이건 여러개 올 수 있다 >> 같은 클래스 내에서 (같은 패키지 내에서는) 계속 임포트할 필요 없다
//java.lang (System이나 String 클래스는 생략해도 됨>> 컴파일러 (java.c.exe가 컴파일됨)
//실행문X


public class ClassTest {
	// 멤버영역(Field변수)
	// 변수 선언하고 객체를 생성한다.
	// 실행문은 사용할 수 없다.
	// 생성자 메소드 (클래스명이랑 같음 >> ex. Scanner scan = new Scanner()) >> 여러개 있어도 되나 단 데이터형은 달라야한다 (변수까지 같아도됨)
	// 객체생성하는 방법
	// Test(){샐행문} >> (new Test()
	// Test(int a){샐행문} >> new Test(100)
	// Test(String a){샐행문} >> new Test("한화")
	// 매개변수 없어도 생성이 되긴함 (컴파일러가해줌)
	
	int num = 100;
	String name;
	double data = 14.2;
	Scanner scan = new Scanner(System.in);
	// 실행문은 사용할 수 없다.
	// 이 변수들은 이미 다 생성되어서 힙이라는 메모리에 등록이 됨
	
	static { //객체만 생성되면 누구보다 먼저!
		//실행문을 멤버영역에서 처리할 때.
		System.out.println("멤버영역에서 메소드 호출"); //실행문이라 멤버변수에서는 안됨
	}
	int result = (int)(num+data);
	
	//생성자 메소드 Constractor method
	//메소드명이 클래스명과 같아야 한다.
	//반환형이 없다.
	//생성자 메소드는 여러개 만들 수 있다. (단, 매개변수의 갯수, 데이터형이 달라야 한다)
	//생성자 메소드는 객체 생성시 한번 실행됨. >> new 하고 만들때!
	ClassTest(){
		System.out.println("ClassTest()......");
	}
	ClassTest(int n){
		System.out.println(n+"->ClassTest(int n)...");
	}
	ClassTest(String n){
		System.out.println(n+"->ClassTest(String n)...");		
		}
	ClassTest(int n, String name){
		System.out.println(n+","+name+"->ClassTest(int n, String name)...");
	}
	ClassTest(String name, int n){
		System.out.println(n+","+name+"->ClassTest(int n, String name)...");
	}
	
	//메소드 : 하나의 작업 단위
	//반드시 소문자로 시작한다
	//반드시 반환형이 있어야함 (생성자 메소드는 있으면 안됨)
	//접근데한자 반환형: void -> 메소드의 실행결과가 돌아오는 값이 없다.
	//메소드명의 소문자로 시작한다 합성어일 경우에는 두번째 단어에서부터 첫글자를 대문자로 한다. <-> 메인 메소드에 만들면은 이후에 호출을 못함
	//java.util.Calendar (캘린더 클래스) / void + 메소드
	
	public void sum() {
		//실행문 (할일: 이 메소드를 호출하면 해야할 일)
		//작업단위를 메소드 단위로 나누어져야한다
		int tot=0;
		for(int i; i<=100; i++) {
			tot +=1;
		}
		System.out.println("합은="+tot);
	}
	public int total(int max) {
		int sum=0;
		for(int i =1; i<=max;i++) {
			sum+=1;
		}
	}

	
	//내부 클래스
	//1.멤버영역의 내부 클래스
	//2.메소드내의 내부 클래스
	//3.익명의 내부 클래스
}
