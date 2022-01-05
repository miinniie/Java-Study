//package
//package aaa;

import java.util.Scanner;
import java.util.Calendar;

public class ClassTest {
	// 멤버영역(Field변수)
	// 변수 선언하고 객체를 생성한다.
	// 실행문은 사용할 수 없다.
	
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
	
	//생성자 메소드 Contractor method
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
	//접근데한자 반환형: void -> 메소드의 실행결과가 돌아오는 값이 없다.
	//메소드명의 소문자로 시작한다 합성어일 경우에는 두번째 단어에서부터 첫글자를 대문자로 한다. <-> 메인 메소드에 만들면은 이후에 호출을 못함
	public void sum() { //메소드명이 클래스명이 아니라면 일반 메소드임
		//실행문 (할일: 이 메소드를 호출하면 해야할 일)
		//작업단위를 메소드 단위로 나누어져야한다
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot +=1;
		}
		System.out.println("합은="+tot);
		System.out.println("total->" + total(200));
	}
	
	public int total(int max) {
		int sum=0;
		for(int i =1; i<=max; i++) {
			sum+=1;
		}
		return sum;
	}
	
}
