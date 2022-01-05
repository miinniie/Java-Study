
class Aclass{
	public int a;
	protected Aclass(int a) {
		this.a=a;
	}
}

class Bclass extends Aclass{
	Bclass(int a) {
		super(a);
	}
}

public class Cclass {
	public static void main(String[] args) {
		Bclass ob = new Bclass(420);
		System.out.print(ob.a);
	}
}
