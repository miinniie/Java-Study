
public class polymorphism {

	public static void main(String[] args) {
		//하위클래스 객체를 상위클래스 객체에 대입하면
		//자동으로 형변환된다.
		Car c = new Car();
		Object obj = new Car();
		
		c.speedUp();
		
		//이건 안됨 >> 원래 형태로 형변환하면 보임
		//obj.speedUp();
		
		//형변환 (원래 형태로 형변환)
		Car c2 = (Car)obj;
		c2.speedUp();
		
		//interface의 형변환
		InterfaceMain m = new InterfaceMain();
		InterfaceTest t = new InterfaceMain();
		InterfaceA a = new InterfaceMain();
		InterfaceB b = new InterfaceMain();
		Object obj2 = new InterfaceMain();
		
		t.add(10, 20);
		System.out.println(a.getData());
		b.multiple(10,20);
		
		InterfaceMain im = (InterfaceMain)a;
		im.minus(600, 300);
		
		//분명히 오버로딩되어있기 때문에 이렇게 가능한거임 >> System Class
		System.out.println(100);
		System.out.println("홍길동");
		System.out.println('c');
		System.out.println(15.22);
		
		
		
	}

}
