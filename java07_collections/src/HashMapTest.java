import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public HashMapTest() {
		//Map interface : HashMap, Hasptable, TreeMap (키를 기준으로 정렬)
		//              : key, value를 가진 컬렉션
		
//		HashMap<String, MemberVO > hm = new HashMap<String, MemberVO>();
		TreeMap<String, MemberVO> hm = new TreeMap<String, MemberVO>();
		hm.put("홍길동", new MemberVO(100,"홍길동","010-1234-5678")); //key,value
		hm.put("손흥민", new MemberVO(200,"손흥민","010-8989-8989")); 
		hm.put("김연아", new MemberVO(300,"김연아","010-8989-1234")); 
		hm.put("박태환", new MemberVO(400,"박태환","010-8989-5555")); 
		hm.put("추신수", new MemberVO(500,"추신수","010-8989-3333")); 
		
		//키에 해당하는 객체 가져오기
		MemberVO obj = hm.get("박태환"); //리턴형이 MemberVO
		System.out.println(obj.toString());
		System.out.println(obj.toString()+"\n===========");
		
		//hashMap의 모든 키를 얻어오기 (Set이니까 순서없이 >> 홍길동, 손흥민 등등이 나옴)
		Set<String> keyList = hm.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			String key = ii.next(); //key
			MemberVO vo = hm.get(key);
			System.out.println(vo.toString());
		}
		
		System.out.println("HashMap에서 value개체 들을 얻어오기");
		Collection<MemberVO> value = hm.values();
		Iterator<MemberVO> iii = value.iterator(); //value보기
		while(iii.hasNext()) {
			MemberVO vo = iii.next();
			System.out.println(vo.toString());
		}
		
		
	}

	public static void main(String[] args) {
		HashMapTest ht = new HashMapTest();
		
		
		
	}

}
