//�߻�Ŭ������ ��ӹ����� ��� �߻�޼ҵ�� ����Ŭ��������
//�������̵� �Ǿ���Ѵ�

public class AbstractMain extends AbstractTest {

	//�� �߻�޼ҵ� �������̵�
	public int add(int a, int b) { //������ ��ȯ
		int result = a+b;
		return result;
	}

	public void multiple(int n1, int n2) {
		//���๮
	}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		
		//�޼ҵ� ȣ�� (�߻�޼ҵ� �ƴѰ�)
		am.minus(300, 400);
		
		//�޼ҵ� ȣ��(�߻�޼ҵ�)
		System.out.println("am.add(8,9)->" + am.add(8, 9));
		
		//�߻�Ŭ���� ��ü ���� >> ��ü �ȸ������
		//�߻�޼ҵ�� �̿ϼ� �޼ҵ� �̱� ������ ��ӹ޾Ƽ� ����Ͽ����Ѵ�
		//AbstractTest at = new AbstractTest();
	}
}
