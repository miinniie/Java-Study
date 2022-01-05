import java.util.LinkedList;

public class LinkedListTest {
	LinkedListTest(){}
	
	public void start() {
		LinkedList<String> ll = new LinkedList<String>();
		
		//��ü �߰�
		ll.offer("�迬��");
		ll.offer("�����");
		ll.addFirst("������"); //���������� ����
		ll.addFirst("�߽ż�"); //�������� ���� (�ڿ���)
		
		//���� �տ� �ִ� ��ü�� ��´�.
		//��ü�� get�ϸ��� �÷��ǿ��� ��ü�� ��������.
		String txt = ll.pop(); //[�߽ż�, �����, �迬��, ������]���� �������� ���� >> offer�̶� pop�� ������
		System.out.println("txt->"+txt);
		
		txt = ll.get(1); //get�� �������� ����
		System.out.println("txt->"+txt);
		System.out.println("size->"+ll.size());
		
		//��ü�� ����ִ��� Ȯ�����ִ� �޼ҵ�
		while(!ll.isEmpty()) {
			System.out.println(ll.pop());
		}
		System.out.println("size->"+ll.size()); //�� pop�ż� ������
	}
	
	public static void main(String[] args) {
		LinkedListTest llt = new LinkedListTest();
		llt.start();
	}
}
