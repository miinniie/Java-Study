
public class polymorphism {

	public static void main(String[] args) {
		//����Ŭ���� ��ü�� ����Ŭ���� ��ü�� �����ϸ�
		//�ڵ����� ����ȯ�ȴ�.
		Car c = new Car();
		Object obj = new Car();
		
		c.speedUp();
		
		//�̰� �ȵ� >> ���� ���·� ����ȯ�ϸ� ����
		//obj.speedUp();
		
		//����ȯ (���� ���·� ����ȯ)
		Car c2 = (Car)obj;
		c2.speedUp();
		
		//interface�� ����ȯ
		InterfaceMain m = new InterfaceMain();
		InterfaceTest t = new InterfaceMain();
		InterfaceA a = new InterfaceMain();
		InterfaceB b = new InterfaceMain();
		Object obj2 = new InterfaceMain();
		
		t.add(10, 20);
		System.out.println(a.getData());
		b.multiple(10,20);
		
		InterfaceMain im = (InterfaceMain)a;
		im.minus(600, 300);
		
		//�и��� �����ε��Ǿ��ֱ� ������ �̷��� �����Ѱ��� >> System Class
		System.out.println(100);
		System.out.println("ȫ�浿");
		System.out.println('c');
		System.out.println(15.22);
		
		
		
	}

}
