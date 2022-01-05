class Test{
	public static void go(Long n) {
		System.out.println("Long");
	}
	public static void go(Short n) {
		System.out.println("Short");
	}
	public static void go(int n) {
		System.out.println("int");
	}
}

public class TestMain {

	public static void main(String[] args) {
		short y =6;
		long z = 7;
		Test.go(y);
		Test.go(z);
	}
}
