import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteTest {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public DeleteTest() {}
	
	public void start() {
		try {
			System.out.print("삭제할 사원번호=");
			int empno = Integer.parseInt(br.readLine());
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empDelete(empno);
			if(cnt>0) {
				System.out.println(empno+"사원의 정보가 삭제되었습니다");
			}else {
				System.out.println("삭제에 실피하였스니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DeleteTest().start();
	}

}
