import java.util.List;

public class SelectTest {

	public SelectTest() {
		//�����ü��� ������
		EmpDAO dao = new EmpDAO();
		List<EmpVO> list = dao.allEmpSelect();
		
		for(EmpVO vo: list) {//Ȯ��� for������ ������
			System.out.printf("%7d %10s %10s %7.2f %7.2f %s\n",
					vo.getEmpno(), vo.getEname(), vo.getJob(), 
					vo.getSal(), vo.getComm(), vo.getHiredate());
		}
	}
	
	
	
	public static void main(String[] args) {
		new SelectTest();
	}
}
