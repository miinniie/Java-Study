import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectionTest2 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public SelectionTest2() {
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.printf("사원번호:");
		int num = Integer.parseInt(scan.nextLine());
		
		EmpDAO dao2 = new EmpDAO();
		List<EmpVO> list = dao2.allEmpSelect();
		
		
		for(EmpVO vo: list) {//확장된 for문으로 돌리기
			if(vo.getEmpno()==num) {
			System.out.printf(
					"사원명->%s\n"
					+ "담담업무->%s\n"
					+ "금여->%3.0f\n"
					+ "보너스->%1.0f\n",
					vo.getEname(), vo.getJob(), 
					vo.getSal(), vo.getComm());
			}
		}
		*/
		
		}
	
		public void start() {
			try {
				System.out.print("사원번호 : ");
				int empno = Integer.parseInt(br.readLine());
				
				EmpDAO dao = new EmpDAO();
				EmpVO vo = dao.oneSelect(empno);
				
				if(vo==null) {
					System.out.println(empno+"사원은 존재하지 않습니다");
				}else {
					System.out.printf(
							"사원명->%s\n"
							+ "담담업무->%s\n"
							+ "금여->%3.0f\n"
							+ "보너스->%1.0f\n",
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
