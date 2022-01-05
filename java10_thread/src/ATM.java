
public class ATM implements Runnable{
	//동시에 진행 안되게 하는 방법
	
	private int money = 20000;
	
	public ATM() {}
	
	//오버라이딩
	//스레드의 동기화: 스레드 메소드가 실행중에는 다른 스레드는 대기상태가 된다
	//메소드에 synchronized(동기화) 키워드를 표기하는 방법
	//>> 접근제한자와 반환형 사이에 위치: ex. public synchronized void run()
	//public synchronized void run() {
	public void run() {
		synchronized(this){
			for(int i=1; i<=10; i++) {
				getMoney(1000);
				
				//동기화 해제, 동기화 설정
				if(money%2000==0) { //동기화 해제: 다른 스레드가 실행될 수 있음
					try {
						this.wait();
					} catch (Exception e) {}
				}else {// 동기화: 다른 스레드는 대기모드로 처리
					this.notify();
					
				}
			}
		}
	}
	
	public void getMoney(int cash) {
		if(money>0) {//출금
			money -= cash;
			// 실행되고 있는 스ㅔ드의 스레드 이름을 구한다.
			System.out.println(Thread.currentThread().getName()+",잔액은 "+money+"원이다");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother" );
		Thread son = new Thread(atm, "son" );
		
		mother.start();
		son.start();
	}
}
