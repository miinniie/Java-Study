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
			//�����ȣ
			System.out.print("�����ȣ=");
			vo.setEmpno(Integer.parseInt(br.readLine()));
			
			//�����
			System.out.print("�����=");
			vo.setEname(br.readLine());
			
			//�޿�
			System.out.print("�޿�=");
			vo.setSal(Double.parseDouble(br.readLine()));
			
			EmpDAO dao = new EmpDAO();
			int cnt = dao.empInsert(vo);
			if(cnt>0) {//�����ϵ�
				System.out.println("����� ��ϵǾ����ϴ�.");
			}else {
				System.out.println("��� ��� �����Ͽ����ϴ�.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new InsertTest().start();
	}
}
