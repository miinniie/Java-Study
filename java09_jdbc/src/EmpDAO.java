import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DBConn {

	public EmpDAO() {
	}
	//���ڵ��߰�
	public int empInsert(EmpVO vo) {
		int result = 0;
		try {
		//1.����̺� �ε�
		//2.DB����
		getConn(); //��ӹ޾Ƴ���
		
		con.setAutoCommit(false); //�ڵ�Ŀ�� ����
		
		//3.�������� �̿��Ͽ� PreparedStatement ��ü�� �����Ѵ�. (���α׷��ֿ����� �������� ���ڿ��� �׳� ����)
		String sql ="insert into emp(empno, hiredate, ename, sal) "
			+ "values(?, sysdate, ?, ?)";
		
			pstmt = con.prepareStatement(sql); //������ ���鶧���� �ʿ��� ����
			
			pstmt.setInt(1,vo.getEmpno()); //����ǥ ��ġ, ���Ե� ��
			pstmt.setString(2,vo.getEname());
			pstmt.setDouble(3,vo.getSal());
			
			//������ ����: insert�� ���ڵ� �� ����(int��) > insert�ϴٰ� �����ϸ� 0
			result = pstmt.executeUpdate();
			
			//////////////////////////////////////////////////////////
			sql = "insert into emp(empno, ename) values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname()); //�ѱ��� �׻� *2 + 4byte(�������)
			
			int cnt = pstmt.executeUpdate();
			
			result += cnt;
			con.commit();
			
		}catch (Exception e) {
			System.out.println("���ڵ��߰� ���ܹ߻�..."+e.getMessage());
			try {
				result=0; //�ʱ�ȭ
				con.rollback();//���ܰ� �߻��ϸ� Ŀ�Ծ��ϰ� �Ѻ�
			} catch (Exception ee) {}
		}finally { //���ܷ� ������ �Ⱥ����� ����Ǵ� ����
			
			setClose();
		}
		return result; //�̰ſ�..
		
	};

	//���ڵ� ����
	public List<EmpVO> allEmpSelect() {
		//vo���� ���� arraylist ����
		List<EmpVO> empList = new ArrayList<EmpVO>(); //ArrayList�� �ƴ� List�� ���� >> ���� Ŭ����
		
		try {
			getConn(); //DB����
			String sql = "select empno, ename, job, hiredate, sal, comm "
					+ "from emp order by empno";
			pstmt = con.prepareStatement(sql); //����ǥ �����ϱ� �ٷ� �����ϸ��
			
			//����
			rs = pstmt.executeQuery();
			
			//next() : ��ġ�� �̵��Ͽ� ���ڵ尡 ������ true, ������ false
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1)); //rs.getInt("empno")
				vo.setEname(rs.getString(2)); //������ ����� �ι�° (DB���� �ι�° ����)
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getString(4));
				vo.setSal(rs.getDouble(5));
				vo.setComm(rs.getDouble(6));
				//�÷��ǿ� ���ڵ� 1���� ������ ��� vo��ü�� �߰�
				empList.add(vo); //vo��ü���� ���� ���ڵ� �÷��ǿ� �߰�
				
			}
			
			
		}catch(Exception e) {
			System.out.println("��� ���ڵ� ���� ���� �߻�...."+e.getMessage());
		}finally {
			setClose(); //DB �ݴ� �۾�
		}
		return empList;
	}
	
	//�����ȣ�� �ش��ϴ� ���ڵ� ���� (1��)
	public EmpVO oneSelect(int empno) {
		EmpVO vo = null;
		try {
			getConn();
			
			String sql = "select ename, job, sal, com from emp where emp empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno); //ù��° ����ǥ �ڸ�
			
			rs = pstmt.executeQuery(); //����
			
			if(rs.next()) {//���õ� ���ڵ尡 ������
				vo = new EmpVO();
				vo.setEname(rs.getString(1));
				vo.setJob(rs.getString(2));
				vo.setSal(rs.getDouble(3));
				vo.setComm(rs.getDouble(4));
			}
			
		}catch(Exception e) {
			System.out.println("1�� ���ڵ� ���� ���ܹ߻�...."+e.getMessage());
		}finally {
			setClose(); //DB �ݴ� �۾�
		}
		return vo;
	};
	
	//���ڵ� ����
	public int empUpdate(int empno, double sal) {
		int result = 0;
		try {
			getConn(); //DB����
			String sql = "update emp set sal=? where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1,sal);
			pstmt.setDouble(2,empno);

			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("����������ܹ߻�-->"+e.getMessage());
		}finally {
			setClose();
		}
		return result;
	}
	//���ڵ� ����
	public int empDelete(int empno) {
		int result = 0;
		try {
			getConn();
			String sql = "delete from emp where empno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			result = pstmt.executeUpdate(); //��� ���ڵ尡 �����Ǿ����� ����
		}catch(Exception e) {
			System.out.println("������� ���� �߻�.."+e.getMessage());
		}finally {
			setClose();
		}
		return result;
	}

}
