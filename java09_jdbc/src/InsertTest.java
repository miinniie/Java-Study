import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertTest {

	public InsertTest() {
		
	}

	public void start() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			EmpVO vo = new EmpVO();
			//사원번호
			System.out.print("사원번호=");
			vo.setEmpno(Integer.parseInt(br.readLine()));
			
			//사원명
			System.out.print("사원명=");
			vo.setEname(br.readLine());
			
			//급여
			System.out.print("급여=");
			vo.setSal(Double.parseDouble(br.readLine()));
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empInsert(vo);
			if(cnt>0) {//사원등록됨
				System.out.println("사원이 등록되었습니다.");
			}else {
				System.out.println("사원 등록 실패하였습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new InsertTest().start();
	}
}
