//�߻�Ŭ������ �߻�޼ҵ带 1�� �̻� �����ϰ� �ִ� Ŭ����
//�߻�޼ҵ� �޼ҵ��� ��ȯ�� �������� ����δ� ���� �޼ҵ带 ���Ѵ�
//�߻�Ŭ������ ��ü�� ������ �� ������, �ݵ�� ��ӹ޾Ƽ� �߻�޼ҵ带 �������̵� ���־���Ѵ�.
//�߻�޼ҵ�� ��ȯ�� ���ʿ� abstract�� ǥ��
//�߻�Ŭ���� class Ű���� ���ʿ� abstract ǥ���Ͽ����Ѵ�.

public abstract class AbstractTest { //�߻�޼ҵ带 ������ �ֱ⶧���� �߻� Ŭ��������
	int data = 200;
	
	//������ �޼ҵ�
	public AbstractTest() {}
	
		//�� > �߻�޼ҵ�� ����� (��ȯ�� ���ʿ� abstract Ű���� ǥ���Ͽ��� �Ѵ�.)
		public abstract int add(int n1, int n2);
	
		//��
		public void minus(int n1, int n2) {
			int result = n1-n2;
			output(n1,n2,result,"-");
		}
		
		//�� > �߻�޼ҵ�� �����
		public abstract int multiple(int n1, int n2);
		
		//��
		public void divide(int n1, int n2) {
			int result = n1/n2;
			output(n1,n2,result,"/");
		}
		
		public void output(int n1, int n2, int result, String operator) {
			System.out.printf("%d %s %d = %d\n", n1,operator,n2,result);
		}
		
		
}
