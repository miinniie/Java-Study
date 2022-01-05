
public class ThreadTest2 extends Thread{

	//스테드는 하나의 프로세스에서 다중 실행이 가능하다.
	//1. Thread 상속
	String msg;
	public ThreadTest2() {}
	public ThreadTest2(String msg) {
		this.msg = msg;
	}
	
	//2.Thread 구현을 하여야하는 기능은 run()메소드에 기술한다.
	public void run() { //오버라이딩
		//구현
		for(int i=1; i<=100; i++) {
			System.out.println(msg+"->"+i);
		}
	}
	
	public void output(int i) {
		System.out.print(msg+"->"+i);
	}
	
	//3.
	
	
	public static void main(String[] args) {
		ThreadTest2 tt1 = new ThreadTest2("첫번째스레드");
		ThreadTest2 tt2 = new ThreadTest2("두번째스레드");
		ThreadTest2 tt3 = new ThreadTest2("세번째스레드");
//		tt1.run();
//		tt2.run();
//		tt3.run();
//		
		//스레드 처리를 하는 run()메소드는 직접호출하지 않고 start메소드 활용
		//스레드 등록한다.
		tt1.start();
		tt2.start();
		tt3.start();
	}

}
