import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {
	
	public Vector getData() {
		MemberVO vo = new MemberVO (200, "ȫ�浿", "010-1111-2222");
		Random random = new Random();
		Calendar date = Calendar.getInstance();
		date.set(2020,10,30);
		String str = "�������";
		Integer intData = 1234;
		
		Vector v = new Vector();
		System.out.println("capacity->"+v.capacity());
		
		//vector�� ��ü �߰��ϱ�
		v.add(vo); //0
		v.addElement(random); //1  2
		v.add(date); //2   3
		v.add(1,str); //1������ �ٽ� str
		v.addElement(intData); //4
		
		return v;
		
	} // �̷��� �ϸ��� setter�� ���ص� VO�� �����̵�

	public Vector<MemberVO> getMember() {
		MemberVO vo = new MemberVO(100,"�迬��","010-4568-7896");
		MemberVO vo1 = new MemberVO(200,"�����","010-4568-1111");
		MemberVO vo2 = new MemberVO(300,"������","010-4568-3333");
		MemberVO vo3 = new MemberVO(400,"����ȯ","010-4568-5555");
		
		Vector<MemberVO> v = new Vector<MemberVO>();
		v.add(vo);
		v.add(vo1);
		v.add(vo2);
		v.add(vo3);
		
		//v.add(new.Random()); �ȵ�
		return v;
		
	}
}
