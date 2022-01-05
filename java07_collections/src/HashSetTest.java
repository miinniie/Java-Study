import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest(){}
	
	public void start() {
		// �ߺ������͸� ����
		// �Է¼����� �������� �ʴ´�
		HashSet<String> hs = new HashSet<String>();
		HashSet<Integer> hs2 = new HashSet<Integer>(); //Ÿ���� int
		
		String name[] = {"�迬��","����ȯ","������","�����","����ȯ"};
		int[] num = {100,400,500,400,400};
		
		for(int i=0; i<num.length; i++) {
			hs.add(name[i]);
			hs2.add(num[i]);
		}
		///////////////////////
		System.out.println("hs->size->"+hs.size()); //����ȯ�� 2�� �־ ����ȯ �Ѹ��� ����� (�ߺ������� ����)
		System.out.println("hs2->size->"+hs2.size()); //400 3�� ������ �ϳ��� ���� (�ߺ������� ����)
		
		//HashSet�� ��ü�� ������ ���ؼ� Iterator��ü�� ���Ͽ��� �Ѵ�.
		Iterator<String> ii = hs.iterator();
		Iterator<Integer> iii = hs2.iterator();
		
		
		//��������� �ٸ����� Ȯ��
		while(ii.hasNext()) { //��ü�� ������ true, ������ false
			String data = ii.next();
			System.out.println(data);
		}
		while(iii.hasNext()) { //��ü�� ������ true, ������ false
			int data = iii.next();
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		HashSetTest ht = new HashSetTest();
		ht.start();
	}
}
