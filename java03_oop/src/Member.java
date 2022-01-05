
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
		// sabun = 500; >> 에러
		position = "사원"; //static이니까 객체 안만들고 해도됨
		
		//객체 만들기
		Member m1 = new Member();
		Member m2 = new Member(5,"홍","과장");
		Member m3 = new Member(200,"최","부장");
		
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
