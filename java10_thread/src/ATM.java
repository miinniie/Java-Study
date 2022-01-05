
public class ATM implements Runnable{
	//���ÿ� ���� �ȵǰ� �ϴ� ���
	
	private int money = 20000;
	
	public ATM() {}
	
	//�������̵�
	//�������� ����ȭ: ������ �޼ҵ尡 �����߿��� �ٸ� ������� �����°� �ȴ�
	//�޼ҵ忡 synchronized(����ȭ) Ű���带 ǥ���ϴ� ���
	//>> ���������ڿ� ��ȯ�� ���̿� ��ġ: ex. public synchronized void run()
	//public synchronized void run() {
	public void run() {
		synchronized(this){
			for(int i=1; i<=10; i++) {
				getMoney(1000);
				
				//����ȭ ����, ����ȭ ����
				if(money%2000==0) { //����ȭ ����: �ٸ� �����尡 ����� �� ����
					try {
						this.wait();
					} catch (Exception e) {}
				}else {// ����ȭ: �ٸ� ������� ������ ó��
					this.notify();
					
				}
			}
		}
	}
	
	public void getMoney(int cash) {
		if(money>0) {//���
			money -= cash;
			// ����ǰ� �ִ� ���ĵ��� ������ �̸��� ���Ѵ�.
			System.out.println(Thread.currentThread().getName()+",�ܾ��� "+money+"���̴�");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother" );
		Thread son = new Thread(atm, "son" );
		
		mother.start();
		son.start();
	}
}
