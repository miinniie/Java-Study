import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Data {
	public List<MemberVO> getMember() {
		MemberVO vo = new MemberVO(100,"±è¿¬¾Æ","010-4568-7896");
		MemberVO vo1 = new MemberVO(200,"¼ÕÈï¹Î","010-4568-1111");
		MemberVO vo2 = new MemberVO(300,"¹ÚÁö¼º","010-4568-3333");
		MemberVO vo3 = new MemberVO(400,"¹ÚÅÂÈ¯","010-4568-5555");
		
		List<MemberVO> lst = new ArrayList<MemberVO>();
		lst.add(vo);
		lst.add(vo1);
		lst.add(vo2);
		lst.add(vo3);
		
		lst.set(1,new MemberVO(1000,"¼¼Á¾´ë¿Õ","010-0000-0000"));
		return lst;
		
	}
}
