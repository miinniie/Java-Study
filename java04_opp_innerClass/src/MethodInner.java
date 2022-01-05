//3. 익명의 클래스
public class MethodInner {
	
	String email = "goguma@nate.com";
	MethodInner(){}
	public void createInner() {
		//InnerTest it1 = new InnerTest();
		String addr = "서울시 영등포구 여의도동";
		//내부클래스: 객체를 생성하여 사용하여야한다
		class InnerTest() {
			int num = 5555;
			String userid = "abcd";
			InnerTest(){}
			void getInformation() {
				System.out.println("번호="+num);
				System.out.println("아이디="+userid);
				System.out.println("이메일="+email);
				System.out.println("주소="+addr);
			}
		}
		InnerTest it = new InnerTest();
		it.getInformation();
	}
}

	public static void main(String[] args) {
		//메소드내의 내부 클래스는 다른클래스에서 사용할 수 없다.
		//new MethodInner().createInner();
		new Method
		
	
	}
