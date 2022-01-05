
public class BBB {
		
		public BBB() {
			AAA aaa = new AAA();
			MemberVO vo = aaa.memberList();
			System.out.println("번호="+vo.getNum());
			System.out.println("이름="+vo.getUserName());
			System.out.println("연락처="+vo.getTel());
		}
		public static void main(String[] args) {
			new BBB();
		}
		
		
}
