import java.util.LinkedList;

public class LinkedListTest {
	LinkedListTest(){}
	
	public void start() {
		LinkedList<String> ll = new LinkedList<String>();
		
		//객체 추가
		ll.offer("김연아");
		ll.offer("손흥민");
		ll.addFirst("박지성"); //오른쪽으로 삽입
		ll.addFirst("추신수"); //왼쪽으로 삽입 (뒤에서)
		
		//제일 앞에 있는 객체를 얻는다.
		//객체를 get하면은 컬렉션에서 객체는 지워진다.
		String txt = ll.pop(); //[추신수, 손흥민, 김연아, 박지성]에서 박지성이 빠짐 >> offer이랑 pop은 지워짐
		System.out.println("txt->"+txt);
		
		txt = ll.get(1); //get은 지워지지 않음
		System.out.println("txt->"+txt);
		System.out.println("size->"+ll.size());
		
		//객체가 비어있는지 확인해주는 메소드
		while(!ll.isEmpty()) {
			System.out.println(ll.pop());
		}
		System.out.println("size->"+ll.size()); //다 pop돼서 없어짐
	}
	
	public static void main(String[] args) {
		LinkedListTest llt = new LinkedListTest();
		llt.start();
	}
}
