import sawon.ClassTest;

public class ClassTestMain {

	public static void main(String[] args) {
		//������ �޼ҵ��� ������ŭ ��ü�� �����ϴ� ����� �����.
		ClassTest ct = new ClassTest(100, "ȫ�浿"); //ClassTest(int)
		//�޼ҵ� ȣ��
		//��ü.�޼ҵ��()
		ct.sum();
		int result = ct.total(150);
		System.out.println(result);
	}
}
