import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteTest {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public DeleteTest() {}
	
	public void start() {
		try {
			System.out.print("������ �����ȣ=");
			int empno = Integer.parseInt(br.readLine());
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empDelete(empno);
			if(cnt>0) {
				System.out.println(empno+"����� ������ �����Ǿ����ϴ�");
			}else {
				System.out.println("������ �����Ͽ����ϴ�.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DeleteTest().start();
	}

}
