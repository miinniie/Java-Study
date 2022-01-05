
public class RunnableTest implements Runnable {
	
	String msg;
	public RunnableTest() {}
	public RunnableTest(String msg) {
		this.msg = msg;
	}
	//run() �������̵�
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
		
		t1.setPriority(Thread.MAX_PRIORITY); //t1�� ���� �����ض�
		
		//�켱���� ����
		
		t1.start();
		t2.start();
	}
}
