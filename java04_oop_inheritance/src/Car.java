
public class Car extends Object{
	int speed = 0;
	
	//������ �޼ҵ�
	public Car() {
		speed = 100;
		System.out.println("Car()������");
	}
	
	public Car(int speed) {
		this.speed = speed;
		System.out.println("Car(int speed)������");
	}

	
	//
	public void speedUp(){
		speed++;
		if(speed>150) speed=150;
		System.out.println("Car.speedUp->"+speed);
	}
	
	//
	public void speedDown() {
		speed--;
		if(speed<0) speed=0;
		System.out.println("Car.speedDown->"+speed);
	}
	
	
}	

