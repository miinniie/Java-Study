
public class InterfaceMain extends Car implements InterfaceTest, InterfaceA{
	//interface�� �߻�޼ҵ� �������̵�
	public void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	public int getData() {
		return 9999; //������ ��� ���� �����
	}
	public void multiple(int a, int b) {
		System.out.println(a*b);
	}
//	public static void main(String[] args) {
//		InterfaceMain im = new InterfaceMain();
//		im.add(50, 30);
//	}
	
	//�����ε�: ���� Ŭ������ ���� �̸��� ���� Ŭ������ ������ (���������ð� �ٸ�)
	public void getData(int a) {
			
		}
	public void getData(String name) {
		
	}
	public void getData(int a , String name) {
			
	}
	
}
