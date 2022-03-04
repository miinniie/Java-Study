//내부 클래스 - 클래스내에 있는 클래스
//1. 맴버영역의 내부 클래스
//2. 메소드내의 내부 클래스
//3. 익명(anonymous)의 내부 클래스

public class Outer {
	int num = 1234;
	String name = "홍길동";
	public Outer() {
		System.out.println("Outer()...");
	}
	public Outer() {}
	public void output() {
		System.out.println("번호="+num);
		System.out.println("이름="+num);
		
		//외부클래스에서 내부클래스의 멤버변수는 접근할 수 없다
		//System.out.println("전화번호="+tel);
	}
	public void createInner(){
		Inner inner = new Inner();
		System.out.println("inner.num->"+inner.num);
	}
	
	//내부클래스
	class Inner{
		int num = 1234;
		String tel = "010-1234-5678";
		Inner(){
			System.out.println("Inner()...");
		}
		void getMember() {
			//내부 클래스는 외부클래스의 모든 멤버변수를 접근할 수 있다
			System.out.println("num="+num+",tel="+tel);
			//System.out.println(super.num);
		}
				
		public static void main(String a[]) {
			Outer outer = new Outer();
			outer.output();
			
			//내부클래스 객체 생성하기
			//방법1
			Outer.Inner i = new Outer().new Inner();
			//방법2
			Outer.Inner ii = outer.new Inner();
			
			i.getMember();
			ii.getMember();
			outer.createInner();
		}
	}
	
	
}
