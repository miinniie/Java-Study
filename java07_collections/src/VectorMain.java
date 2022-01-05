import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		
	}
	public void start() {
		// index�� �ִ�,
		// ��ü�� ������ ���͵� ��ü�� �������� �ʴ´�.
		VectorTest vt = new VectorTest();
		Vector v = vt.getData();
		System.out.println("��ü��->"+ v.size());
		
		MemberVO vo = (MemberVO)v.get(0);//ù���� �ε����� //����Ŭ������ ����Ŭ������ �����鼭 ����ȯ�ؾ���
		System.out.println(vo.getNum()+", "+vo.getUserName()+", "+vo.getTel());
		
		//vector�� ù��° ������
		String txt = (String)v.get(1);
		System.out.println("txt->"+txt);
		
		//vector�� �ι�° ������
		Random r = (Random)v.get(2);
		System.out.println("random0>"+r.nextInt(1000));
		
		//vector�� ����° ������
		Calendar d = (Calendar)v.get(3);
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(fmt.format(d.getTime()));
		
		//vector�� �׹�° ������
		int intData = (int)v.get(4);
		System.out.println("intData->"+intData);
		
		//���ʸ��� �̿��� �÷��� ����ϱ�
		Vector<MemberVO> list = vt.getMember();
//		
//		for(int i=0; i<list.size();i++) {
//			Vector<MemberVO> temp = List<MemberVO>;
//			System.out.println(temp.toString);
//		}
		
		//ȸ�� ����ϱ�(�ݺ���) 
		for(int i=0; i<list.size(); i++) {
			MemberVO vecVo = list.get(i); //���ʸ��� ����ȯ�� �������䰡 ����
			System.out.println(vecVo.getNum()+", "+ vecVo.getUserName()+", "+vecVo.getTel());
		}
		
		
	}
	
	public static void main(String[] args) {
		VectorMain vm = new VectorMain();
		vm.start();
		
	}
}
