import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectionTest2 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public SelectionTest2() {
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.printf("�����ȣ:");
		int num = Integer.parseInt(scan.nextLine());
		
		EmpDAO dao2 = new EmpDAO();
		List<EmpVO> list = dao2.allEmpSelect();
		
		
		for(EmpVO vo: list) {//Ȯ��� for������ ������
			if(vo.getEmpno()==num) {
			System.out.printf(
					"�����->%s\n"
					+ "������->%s\n"
					+ "�ݿ�->%3.0f\n"
					+ "���ʽ�->%1.0f\n",
					vo.getEname(), vo.getJob(), 
					vo.getSal(), vo.getComm());
			}
		}
		*/
		
		}
	
		public void start() {
			try {
				System.out.print("�����ȣ : ");
				int empno = Integer.parseInt(br.readLine());
				
				EmpDAO dao = new EmpDAO();
				EmpVO vo = dao.oneSelect(empno);
				
				if(vo==null) {
					System.out.println(empno+"����� �������� �ʽ��ϴ�");
				}else {
					System.out.printf(
							"�����->%s\n"
							+ "������->%s\n"
							+ "�ݿ�->%3.0f\n"
							+ "���ʽ�->%1.0f\n",
							vo.getEname(), vo.getJob(), 
							vo.getSal(), vo.getComm());
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		new SelectionTest2().start();
	}

}
