
public class ThreadTest2 extends Thread{

	//���׵�� �ϳ��� ���μ������� ���� ������ �����ϴ�.
	//1. Thread ���
	String msg;
	public ThreadTest2() {}
	public ThreadTest2(String msg) {
		this.msg = msg;
	}
	
	//2.Thread ������ �Ͽ����ϴ� ����� run()�޼ҵ忡 ����Ѵ�.
	public void run() { //�������̵�
		//����
		for(int i=1; i<=100; i++) {
			System.out.println(msg+"->"+i);
		}
	}
	
	public void output(int i) {
		System.out.print(msg+"->"+i);
	}
	
	//3.
	
	
	public static void main(String[] args) {
		ThreadTest2 tt1 = new ThreadTest2("ù��°������");
		ThreadTest2 tt2 = new ThreadTest2("�ι�°������");
		ThreadTest2 tt3 = new ThreadTest2("����°������");
//		tt1.run();
//		tt2.run();
//		tt3.run();
//		
		//������ ó���� �ϴ� run()�޼ҵ�� ����ȣ������ �ʰ� start�޼ҵ� Ȱ��
		//������ ����Ѵ�.
		tt1.start();
		tt2.start();
		tt3.start();
	}

}
