//�͸��� ���� Ŭ���� : ���ο� Ŭ������ ��������� �ʴ°�

public class AnonymousInner {

	public AnonymousInner() {
	}
	public void start() {
		//�͸��� ���� Ŭ���� : Ŭ�������� �������� �ʴ� Ŭ����
		
		Sample sam = new Sample() { //Sample sam = new Sample() �̷��� ������� �ʤ�,����
			//�ʿ��� ������ �߰� �Ǵ� �������̵��� ����Ѵ�.
			public void sum() {
				int i = 0;
				for(int j=1; j<=100; j+=2) {
					i +=j;
				}
				System.out.println("i="+i);
			}
			public void output() {
				System.out.println("�����߰��� �޼ҵ�...");
			}
		};         //.output(); //.sum(); //������
		sam.sum();
		//sam.outout(); ����� �� ���� �ڵ�
	}
	
	
	public static void main(String[] args) {
		new AnonymousInner().start();
		
	}
}
