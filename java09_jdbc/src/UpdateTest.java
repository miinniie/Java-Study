import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateTest {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public UpdateTest() {}
		
	public void start() {
	/*
	 실행결과
	 수정할 사원번호: 1234
	 수정할 급여: 8000	
	 */
		
		try {
			System.out.print("정보를 수정할 사원번호");
			int empno = Integer.parseInt(br.readLine());
			System.out.println("급여수정할 값->");
			double sal = Double.parseDouble(br.readLine());
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empUpdate(empno, sal);
			if(cnt>0) {
				System.out.println(empno+"사원의 급여를"+sal+"수정하였습니다.");
				
			}else {
				System.out.println("수정을 실패하였습니다");	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		new UpdateTest().start();
	}
}
