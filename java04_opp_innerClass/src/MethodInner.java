//3. �͸��� Ŭ����
public class MethodInner {
	
	String email = "goguma@nate.com";
	MethodInner(){}
	public void createInner() {
		//InnerTest it1 = new InnerTest();
		String addr = "����� �������� ���ǵ���";
		//����Ŭ����: ��ü�� �����Ͽ� ����Ͽ����Ѵ�
		class InnerTest() {
			int num = 5555;
			String userid = "abcd";
			InnerTest(){}
			void getInformation() {
				System.out.println("��ȣ="+num);
				System.out.println("���̵�="+userid);
				System.out.println("�̸���="+email);
				System.out.println("�ּ�="+addr);
			}
		}
		InnerTest it = new InnerTest();
		it.getInformation();
	}
}

	public static void main(String[] args) {
		//�޼ҵ峻�� ���� Ŭ������ �ٸ�Ŭ�������� ����� �� ����.
		//new MethodInner().createInner();
		new Method
		
	
	}
