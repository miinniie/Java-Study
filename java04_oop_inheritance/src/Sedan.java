
//Car 클래스를 상속받기
public class Sedan extends Car {
	int speed = 50;
	
	//생성자 메소드 >> 상속받을때는 반드시 써야함
	public Sedan(){
		speed = 90;
		System.out.println("Sedan()생성자");
	}
	
	public Sedan(int speed) {
		//매겨변수 없는 생성자는 자동 호출되지 않기때문에 >> super()이용해야함
		super(78); //항위에서 상위 클래스의 다른 생성자를 호출한다 >> 얘가 없으면은 매개변수 없는 Car()이 호출됨
		this.speed = speed;
		System.out.println("Sedan(int speed)생성자");
	}
	
	//오버라이딩(Overriding): (이미 있는)상위 클래스의 메소드를 하위클래스에서 재정의
	public void speedUp() {
		speed += 10;
		if(speed>250) {
			speed = 250;
		}
		System.out.println("Sedan.speedUp->"+speed);
	}
	
//	public void start() {
//		// Sedan s = new Sedan();
//		// s.speedUp(); // Sedan에 메소드 없는데 호출 가능 (상속)
//		speedUp();
//		speedUp();
//		System.out.println("speed->" + speed);
//		speedDown();
//		
//		//하위에서 상위클래스의 오버라이딩 메소드 호출
//		super.speedUp();
//	}	
		
	public static void main(String[] a) {
		new Sedan(70);
	}
}
