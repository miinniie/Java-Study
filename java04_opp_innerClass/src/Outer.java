//���� Ŭ���� - Ŭ�������� �ִ� Ŭ����
//1. �ɹ������� ���� Ŭ����
//2. �޼ҵ峻�� ���� Ŭ����
//3. �͸�(anonymous)�� ���� Ŭ����

public class Outer {
	int num = 1234;
	String name = "ȫ�浿";
	public Outer() {
		System.out.println("Outer()...");
	}
	public Outer() {}
	public void output() {
		System.out.println("��ȣ="+num);
		System.out.println("�̸�="+num);
		
		//�ܺ�Ŭ�������� ����Ŭ������ ��������� ������ �� ����
		//System.out.println("��ȭ��ȣ="+tel);
	}
	public void createInner(){
		Inner inner = new Inner();
		System.out.println("inner.num->"+inner.num);
	}
	
	//����Ŭ����
	class Inner{
		int num = 1234;
		String tel = "010-1234-5678";
		Inner(){
			System.out.println("Inner()...");
		}
		void getMember() {
			//���� Ŭ������ �ܺ�Ŭ������ ��� ��������� ������ �� �ִ�
			System.out.println("num="+num+",tel="+tel);
			//System.out.println(super.num);
		}
				
		public static void main(String a[]) {
			Outer outer = new Outer();
			outer.output();
			
			//����Ŭ���� ��ü �����ϱ�
			//���1
			Outer.Inner i = new Outer().new Inner();
			//���2
			Outer.Inner ii = outer.new Inner();
			
			i.getMember();
			ii.getMember();
			outer.createInner();
		}
	}
	
	
}
