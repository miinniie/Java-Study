
//Car Ŭ������ ��ӹޱ�
public class Sedan extends Car {
	int speed = 50;
	
	//������ �޼ҵ� >> ��ӹ������� �ݵ�� �����
	public Sedan(){
		speed = 90;
		System.out.println("Sedan()������");
	}
	
	public Sedan(int speed) {
		//�Űܺ��� ���� �����ڴ� �ڵ� ȣ����� �ʱ⶧���� >> super()�̿��ؾ���
		super(78); //�������� ���� Ŭ������ �ٸ� �����ڸ� ȣ���Ѵ� >> �갡 �������� �Ű����� ���� Car()�� ȣ���
		this.speed = speed;
		System.out.println("Sedan(int speed)������");
	}
	
	//�������̵�(Overriding): (�̹� �ִ�)���� Ŭ������ �޼ҵ带 ����Ŭ�������� ������
	public void speedUp() {
		speed += 10;
		if(speed>250) {
			speed = 250;
		}
		System.out.println("Sedan.speedUp->"+speed);
	}
	
//	public void start() {
//		// Sedan s = new Sedan();
//		// s.speedUp(); // Sedan�� �޼ҵ� ���µ� ȣ�� ���� (���)
//		speedUp();
//		speedUp();
//		System.out.println("speed->" + speed);
//		speedDown();
//		
//		//�������� ����Ŭ������ �������̵� �޼ҵ� ȣ��
//		super.speedUp();
//	}	
		
	public static void main(String[] a) {
		new Sedan(70);
	}
}
