
public class RunnableTest implements Runnable {
	
	String msg;
	public RunnableTest() {}
	public RunnableTest(String msg) {
		this.msg = msg;
	}
	//run() 오버라이딩
	public void run() {
		for(int i=1000; i<=1200; i++) {
			System.out.println(msg+"=>"+i);
		}
	}
	
	public static void main(String[] args) {
		RunnableTest rt1 = new RunnableTest("first");
		RunnableTest rt2 = new RunnableTest("second");
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		
		t1.setPriority(Thread.MAX_PRIORITY); //t1을 먼저 실행해라
		
		//우선순위 설정
		
		t1.start();
		t2.start();
	}
}
