

public class ThreadTest {

	public ThreadTest() {}

	public void start() {
		int cnt=1;
		while(true) {
			System.out.println("Test");
			if(cnt>=100) {
				break;
			}
		}
		for(int i=1;;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new ThreadTest().start();;
	}
}
