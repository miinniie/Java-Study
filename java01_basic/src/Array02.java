
public class Array02 {

	public static void main(String[] args) {
		// 데이터를 포로그램 안으로 가지고 가는 통로이다
		// 현재 클래스를 실행시 아이디와, 비밀번호를 입력을 받아
		// 아이디와 비밀번호가 일치할 경우만 프로그램이 구현된다.
		
		if(args[0].equals("admin") && args[1].equals("1234")) {
			System.out.println("로그인이 되었습니다.");
		}else {
			System.out.println("로그인 실패하였습니다.");
		}
		
	}
}
