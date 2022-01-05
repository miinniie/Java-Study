
public class ClassTest2 {

		//멤버영역
		int num; // 초기값 = 0
		String name; // 초기값 = null
		
		//생성자메소드
		ClassTest2(){}
		ClassTest2(int num){
			this.num = num; // this = 멤버영역을 가르킴 (이름이 같으면 이렇게 지정하면된다), 멤버변수와 지역변수가 같을떄 현재 클래스의 멤버 영역을 지정하는 키워드
			
		}
		ClassTest2(int num, String name){
			//this.name = name; 같은 메소드라면 생성자 내에서 이미 있는 다른 생성자를 호출
			//생성자메소드에서 다른 생성자 메소드 호출하기
			//ClassTest2()는 에러여서 > this()로 받아야함
			//반드시 첫번째 실행문이어야함
			this(num);
			this.num = num;
		}
		
//		ClassTest2(int num2){
//			num = num2;
//			
//		}
		
		void sum() {
			int s=0;
			for(int i=1; i<=num ; i++) {
				s+=i;
			}
			System.out.println("1~"+num+"까지의 합은="+s);
		}
		
	
}
