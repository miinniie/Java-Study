import sawon.ListTest; //��Ű���� Ŭ���� import

public class ModifierMain {
	
	public ModifierMain() {}
	public void start() {
		//default���� ������ + �׸��� class�� public�̿��� �޼ҵ尡 �ƴϸ� �ȵ� + �ٸ� ��Ű����� import�ؾ���
		ModifierTest mt = new ModifierTest();
		
		//���� �����ڰ� default �̱� ������ ���� �ȵ�
		ListTest lt = new ListTest();
		
		//��ü���� ���� �����ϱ�
		System.out.println("mt.num->"+ mt.num);
		
		// �� ��ü�� ���� Ŭ������ �ٸ� ��Ű���� �־ ����
//		System.out.println("lt.name->"+ lt.name);
		
		//�޼ҵ� ȣ��
		mt.numPrint();
		lt.namePrint(); //default: �ٸ� ��Ű���� �޼ҵ� ����� �� ����
		
		//private: Ŭ���� �ܺο��� ��ü�� ���Ͽ� ������ �� ����
		//System.out.println(mt.tel); //ĸ��ȭ: �ܺο��� �����ϰ� ���ƹ����°�
		
		//System.out.println("addr="+lt.addr);
		
		//lt.addrOutput();//�ȵ�
		//ModifierTest mt2 = new ModifierTest("010-4568-9999");?
		
		//static: new�� ��ü�� �ȸ��� �� �� �ְ��ϴ°�
		System.out.println(ModifierTest.num); //Ŭ������.�������
		ModifierTest.numPrint();
		
		
	}
	
	public static void main(String[] args) {
		new ModifierMain().start();
	}
}
