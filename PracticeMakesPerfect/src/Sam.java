
class Test {
	protected static int add(int a, int b) {
		return a+b;
	}
}

class Ex extends Test{	
	protected static int add(int a, int b) {
		int x = Test.add(10,5);
		return x;
	}
}

public class Sam{
	public static void main(String[] args) {
		System.out.println(Ex.add(10, 5));
	}
}

