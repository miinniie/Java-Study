import java.util.List;

public class SelectTest {

	public SelectTest() {
		//사원전체목록 얻어오기
		EmpDAO dao = new EmpDAO();
		List<EmpVO> list = dao.allEmpSelect();
		
		for(EmpVO vo: list) {//확장된 for문으로 돌리기
			System.out.printf("%7d %10s %10s %7.2f %7.2f %s\n",
					vo.getEmpno(), vo.getEname(), vo.getJob(), 
					vo.getSal(), vo.getComm(), vo.getHiredate());
		}
	}
	
	
	
	public static void main(String[] args) {
		new SelectTest();
	}
}
