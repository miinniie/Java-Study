//interface는 추상메소드를 저장하는 곳이다
//일반 메소드는 정의할 수 없다.
//static final변수를 선언하 수 있다
//interface가 interface를 상속 받을

public interface InterfaceTest extends InterfaceB{
	public static final int CODE = 1234;
	public static final String ADMIN_ID = "master";
	
	public void add(int a, int b);
	public void minus(int a, int b);	
}
