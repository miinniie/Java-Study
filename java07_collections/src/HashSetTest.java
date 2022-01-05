import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest(){}
	
	public void start() {
		// 중복데이터를 제거
		// 입력순서를 유지하지 않는다
		HashSet<String> hs = new HashSet<String>();
		HashSet<Integer> hs2 = new HashSet<Integer>(); //타입이 int
		
		String name[] = {"김연아","박태환","박지성","손흥민","박태환"};
		int[] num = {100,400,500,400,400};
		
		for(int i=0; i<num.length; i++) {
			hs.add(name[i]);
			hs2.add(num[i]);
		}
		///////////////////////
		System.out.println("hs->size->"+hs.size()); //박태환이 2명 있어서 박태환 한명은 사라짐 (중복데이터 제거)
		System.out.println("hs2->size->"+hs2.size()); //400 3개 있으서 하나만 저장 (중복데이터 제거)
		
		//HashSet의 객체를 얻어오기 위해서 Iterator객체를 구하여야 한다.
		Iterator<String> ii = hs.iterator();
		Iterator<Integer> iii = hs2.iterator();
		
		
		//저장순서가 다른것을 확인
		while(ii.hasNext()) { //객체가 있으면 true, 없으면 false
			String data = ii.next();
			System.out.println(data);
		}
		while(iii.hasNext()) { //객체가 있으면 true, 없으면 false
			int data = iii.next();
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		HashSetTest ht = new HashSetTest();
		ht.start();
	}
}
