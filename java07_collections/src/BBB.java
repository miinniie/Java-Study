
public class BBB {
		
		public BBB() {
			AAA aaa = new AAA();
			MemberVO vo = aaa.memberList();
			System.out.println("��ȣ="+vo.getNum());
			System.out.println("�̸�="+vo.getUserName());
			System.out.println("����ó="+vo.getTel());
		}
		public static void main(String[] args) {
			new BBB();
		}
		
		
}
