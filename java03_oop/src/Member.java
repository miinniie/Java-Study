
public class Member {
	int sabun;
	String name;
	static String position;
	
	Member(){}
	Member(int sabun, String name, String position){
		this.sabun = sabun;
		this.name = name;
		this.position = position;
	}
	
	void memberOutput(){
		System.out.printf("%8d %8s %8s\n", sabun, name, position);
	}
	
	public static void main(String[] args) {
		// sabun = 500; >> ����
		position = "���"; //static�̴ϱ� ��ü �ȸ���� �ص���
		
		//��ü �����
		Member m1 = new Member();
		Member m2 = new Member(5,"ȫ","����");
		Member m3 = new Member(200,"��","����");
		
		//
		m2.memberOutput(){
			System.out.printf("%8d %8s %8s\n", sabun, name, position);
	 	}
		
		void data() {
			//static String email;
		}
		
		public static void main(String[], args) {
			
		}
		
		
		
		
	}
}
