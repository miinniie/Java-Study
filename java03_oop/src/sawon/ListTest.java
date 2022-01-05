package sawon;

public class ListTest {
	String name = "홍길동";
	private String addr = "서울 영등포구 여의도";
	
	public ListTest(){
		System.out.println("ListTest()");
	}
	public void namePrint() {
		System.out.println("name="+name);
	}
	private void addrOutput() {
		System.out.println("주소:"+addr);
	}
}
