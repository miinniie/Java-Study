
public class ClassTest2 {

		//�������
		int num; // �ʱⰪ = 0
		String name; // �ʱⰪ = null
		
		//�����ڸ޼ҵ�
		ClassTest2(){}
		ClassTest2(int num){
			this.num = num; // this = ��������� ����Ŵ (�̸��� ������ �̷��� �����ϸ�ȴ�), ��������� ���������� ������ ���� Ŭ������ ��� ������ �����ϴ� Ű����
			
		}
		ClassTest2(int num, String name){
			//this.name = name; ���� �޼ҵ��� ������ ������ �̹� �ִ� �ٸ� �����ڸ� ȣ��
			//�����ڸ޼ҵ忡�� �ٸ� ������ �޼ҵ� ȣ���ϱ�
			//ClassTest2()�� �������� > this()�� �޾ƾ���
			//�ݵ�� ù��° ���๮�̾����
			this(num);
			this.num = num;
		}
		
//		ClassTest2(int num2){
//			num = num2;
//			
//		}
		
		void sum() {
			int s=0;
			for(int i=1; i<=num ; i++) {
				s+=i;
			}
			System.out.println("1~"+num+"������ ����="+s);
		}
		
	
}
