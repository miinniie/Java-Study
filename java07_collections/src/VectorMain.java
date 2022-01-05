import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		
	}
	public void start() {
		// index가 있다,
		// 객체를 가지고 나와도 객체가 지워지지 않는다.
		VectorTest vt = new VectorTest();
		Vector v = vt.getData();
		System.out.println("객체수->"+ v.size());
		
		MemberVO vo = (MemberVO)v.get(0);//첫번쨰 인덱스를 //상위클래스를 하위클래스에 넣으면서 형변환해야함
		System.out.println(vo.getNum()+", "+vo.getUserName()+", "+vo.getTel());
		
		//vector의 첫번째 데이터
		String txt = (String)v.get(1);
		System.out.println("txt->"+txt);
		
		//vector의 두번째 데이터
		Random r = (Random)v.get(2);
		System.out.println("random0>"+r.nextInt(1000));
		
		//vector의 세번째 데이터
		Calendar d = (Calendar)v.get(3);
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(fmt.format(d.getTime()));
		
		//vector의 네번째 데이터
		int intData = (int)v.get(4);
		System.out.println("intData->"+intData);
		
		//제너릭을 이용한 컬렉션 사용하기
		Vector<MemberVO> list = vt.getMember();
//		
//		for(int i=0; i<list.size();i++) {
//			Vector<MemberVO> temp = List<MemberVO>;
//			System.out.println(temp.toString);
//		}
		
		//회원 출력하기(반복문) 
		for(int i=0; i<list.size(); i++) {
			MemberVO vecVo = list.get(i); //제너릭은 형변환을 해줄핗요가 없다
			System.out.println(vecVo.getNum()+", "+ vecVo.getUserName()+", "+vecVo.getTel());
		}
		
		
	}
	
	public static void main(String[] args) {
		VectorMain vm = new VectorMain();
		vm.start();
		
	}
}
