import sawon.ListTest; //패키지의 클래스 import

public class ModifierMain {
	
	public ModifierMain() {}
	public void start() {
		//default접근 제한자 + 그리고 class가 public이여도 메소드가 아니면 안됨 + 다른 패키지라면 import해야함
		ModifierTest mt = new ModifierTest();
		
		//접근 제한자가 default 이기 떄문에 실행 안됨
		ListTest lt = new ListTest();
		
		//객체내의 변수 접근하기
		System.out.println("mt.num->"+ mt.num);
		
		// 이 객체는 현재 클래스와 다른 패키지에 있어서 에러
//		System.out.println("lt.name->"+ lt.name);
		
		//메소드 호출
		mt.numPrint();
		lt.namePrint(); //default: 다른 팩키지의 메소드 사용할 수 없음
		
		//private: 클래스 외부에서 객체를 통하여 접근할 수 없다
		//System.out.println(mt.tel); //캡슐화: 외부에서 사용못하게 막아버리는것
		
		//System.out.println("addr="+lt.addr);
		
		//lt.addrOutput();//안됨
		//ModifierTest mt2 = new ModifierTest("010-4568-9999");?
		
		//static: new로 객체를 안만들어도 쓸 수 있게하는것
		System.out.println(ModifierTest.num); //클래스명.멤버변수
		ModifierTest.numPrint();
		
		
	}
	
	public static void main(String[] args) {
		new ModifierMain().start();
	}
}
