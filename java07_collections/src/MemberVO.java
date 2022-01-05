//데이터를 보관하기 위해서 만드는 클래스
//1. VO(Value Object) Class
//2. DTO(Data Table Object) Class
//>> 변수를 전부 캡슐화(객체를 통해서 접근하는거 못하게)

public class MemberVO {
	//변수
	private int num;
	private String userName;
	private String tel;
	
	private MemberVO() {} //매개변수 없는 생성자
	public MemberVO(int num, String userName, String tel) { //매개변수 있는 생성자
		this.num = num;
		this.userName = userName;
		this.tel = tel;
	}
//	MemberVO z = new MemberVO();
//	z.name = "홍길동"; //에러 >> 캡슐화 (private)
	
	
	//setter(num 변수 >> 변수마다 따로 있음) 
	public void setNum(int num) { 
		this.num = num;
	}
	
	//getter(num 변수)
	public int getNum() {
		return num;
	}
	
	//setter(userName 변수) 
	public void setUserName(String name) { 
		this.userName = name;
	}
	
	//getter(userName 변수)
	public String getUserName() {
		return userName;
	}
	
	//setter(tel 변수) 
	public void setTel(String tel) { 
		this.tel = tel;
	}
	
	//getter(tel 변수)
	public String getTel() {
		return tel;
	}
	
	//회원정보를 문자열로 만들어 문자열로 리턴하는 메소드 생성하기
	//Object(상위클래스)에 있는 toString메서드를 하위클래스에서 toString이라는 메소드로 오버라이딩
	public String toString() {
		String result = num + "\t" + userName + "\t" + tel;
		return result;
	}
	
	
	
	
	
	
	
	
}
