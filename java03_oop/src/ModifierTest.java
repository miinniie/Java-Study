
public class ModifierTest {
	
	static int num=1234; //�������
	
	private String tel ="010-1234-5678";
	
	ModifierTest(){
		System.out.println("ModifierTest()");
	}
	
	private ModifierTest(String tel) {
		this.tel = tel;
	}
	
	static void numPrint() { //�޼ҵ�
		System.out.println(num);
	}
}
