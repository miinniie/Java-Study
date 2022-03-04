
public class ModifierTest {
	
	static int num=1234; //멤버변수
	
	private String tel ="010-1234-5678";
	
	ModifierTest(){
		System.out.println("ModifierTest()");
	}
	
	private ModifierTest(String tel) {
		this.tel = tel;
	}
	
	static void numPrint() { //메소드
		System.out.println(num);
	}
}
