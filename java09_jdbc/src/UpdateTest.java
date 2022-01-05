import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateTest {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public UpdateTest() {}
		
	public void start() {
	/*
	 ������
	 ������ �����ȣ: 1234
	 ������ �޿�: 8000	
	 */
		
		try {
			System.out.print("������ ������ �����ȣ");
			int empno = Integer.parseInt(br.readLine());
			System.out.println("�޿������� ��->");
			double sal = Double.parseDouble(br.readLine());
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empUpdate(empno, sal);
			if(cnt>0) {
				System.out.println(empno+"����� �޿���"+sal+"�����Ͽ����ϴ�.");
				
			}else {
				System.out.println("������ �����Ͽ����ϴ�");	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		new UpdateTest().start();
	}
}
