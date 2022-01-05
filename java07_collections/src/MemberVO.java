//�����͸� �����ϱ� ���ؼ� ����� Ŭ����
//1. VO(Value Object) Class
//2. DTO(Data Table Object) Class
//>> ������ ���� ĸ��ȭ(��ü�� ���ؼ� �����ϴ°� ���ϰ�)

public class MemberVO {
	//����
	private int num;
	private String userName;
	private String tel;
	
	private MemberVO() {} //�Ű����� ���� ������
	public MemberVO(int num, String userName, String tel) { //�Ű����� �ִ� ������
		this.num = num;
		this.userName = userName;
		this.tel = tel;
	}
//	MemberVO z = new MemberVO();
//	z.name = "ȫ�浿"; //���� >> ĸ��ȭ (private)
	
	
	//setter(num ���� >> �������� ���� ����) 
	public void setNum(int num) { 
		this.num = num;
	}
	
	//getter(num ����)
	public int getNum() {
		return num;
	}
	
	//setter(userName ����) 
	public void setUserName(String name) { 
		this.userName = name;
	}
	
	//getter(userName ����)
	public String getUserName() {
		return userName;
	}
	
	//setter(tel ����) 
	public void setTel(String tel) { 
		this.tel = tel;
	}
	
	//getter(tel ����)
	public String getTel() {
		return tel;
	}
	
	//ȸ�������� ���ڿ��� ����� ���ڿ��� �����ϴ� �޼ҵ� �����ϱ�
	//Object(����Ŭ����)�� �ִ� toString�޼��带 ����Ŭ�������� toString�̶�� �޼ҵ�� �������̵�
	public String toString() {
		String result = num + "\t" + userName + "\t" + tel;
		return result;
	}
	
	
	
	
	
	
	
	
}
