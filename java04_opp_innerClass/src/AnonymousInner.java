//익명의 내부 클래스 : 새로운 클래스를 만들어주지 않는거

public class AnonymousInner {

	public AnonymousInner() {
	}
	public void start() {
		//익명의 내부 클래스 : 클래스명이 존재하지 않는 클래스
		
		Sample sam = new Sample() { //Sample sam = new Sample() 이렇게 기술하지 않ㄴ,ㄴ다
			//필요한 가능을 추가 또는 오버라이딩을 기술한다.
			public void sum() {
				int i = 0;
				for(int j=1; j<=100; j+=2) {
					i +=j;
				}
				System.out.println("i="+i);
			}
			public void output() {
				System.out.println("새로추가된 메소드...");
			}
		};         //.output(); //.sum(); //샐행방법
		sam.sum();
		//sam.outout(); 사용할 수 없는 코드
	}
	
	
	public static void main(String[] args) {
		new AnonymousInner().start();
		
	}
}
