
public class InterfaceMain extends Car implements InterfaceTest, InterfaceA{
	//interface의 추상메소드 오버라이딩
	public void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	public int getData() {
		return 9999; //리턴이 없어서 리턴 줘야함
	}
	public void multiple(int a, int b) {
		System.out.println(a*b);
	}
//	public static void main(String[] args) {
//		InterfaceMain im = new InterfaceMain();
//		im.add(50, 30);
//	}
	
	//오버로딩: 같은 클래스에 같은 이름을 가진 클래스가 여러개 (오버라이팅과 다름)
	public void getData(int a) {
			
		}
	public void getData(String name) {
		
	}
	public void getData(int a , String name) {
			
	}
	
}
