import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public HashMapTest() {
		//Map interface : HashMap, Hasptable, TreeMap (Ű�� �������� ����)
		//              : key, value�� ���� �÷���
		
//		HashMap<String, MemberVO > hm = new HashMap<String, MemberVO>();
		TreeMap<String, MemberVO> hm = new TreeMap<String, MemberVO>();
		hm.put("ȫ�浿", new MemberVO(100,"ȫ�浿","010-1234-5678")); //key,value
		hm.put("�����", new MemberVO(200,"�����","010-8989-8989")); 
		hm.put("�迬��", new MemberVO(300,"�迬��","010-8989-1234")); 
		hm.put("����ȯ", new MemberVO(400,"����ȯ","010-8989-5555")); 
		hm.put("�߽ż�", new MemberVO(500,"�߽ż�","010-8989-3333")); 
		
		//Ű�� �ش��ϴ� ��ü ��������
		MemberVO obj = hm.get("����ȯ"); //�������� MemberVO
		System.out.println(obj.toString());
		System.out.println(obj.toString()+"\n===========");
		
		//hashMap�� ��� Ű�� ������ (Set�̴ϱ� �������� >> ȫ�浿, ����� ����� ����)
		Set<String> keyList = hm.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			String key = ii.next(); //key
			MemberVO vo = hm.get(key);
			System.out.println(vo.toString());
		}
		
		System.out.println("HashMap���� value��ü ���� ������");
		Collection<MemberVO> value = hm.values();
		Iterator<MemberVO> iii = value.iterator(); //value����
		while(iii.hasNext()) {
			MemberVO vo = iii.next();
			System.out.println(vo.toString());
		}
		
		
	}

	public static void main(String[] args) {
		HashMapTest ht = new HashMapTest();
		
		
		
	}

}
