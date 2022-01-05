import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DBConn {

	public EmpDAO() {
	}
	//레코드추가
	public int empInsert(EmpVO vo) {
		int result = 0;
		try {
		//1.드라이브 로딩
		//2.DB연결
		getConn(); //상속받아놓음
		
		con.setAutoCommit(false); //자동커밋 해제
		
		//3.쿼리문을 이용하여 PreparedStatement 객체를 생성한다. (프로그래밍에서의 쿼리문은 문자열로 그냥 만듦)
		String sql ="insert into emp(empno, hiredate, ename, sal) "
			+ "values(?, sysdate, ?, ?)";
		
			pstmt = con.prepareStatement(sql); //쿼리문 만들때마다 필요한 변수
			
			pstmt.setInt(1,vo.getEmpno()); //물음표 위치, 대입될 값
			pstmt.setString(2,vo.getEname());
			pstmt.setDouble(3,vo.getSal());
			
			//쿼리문 실행: insert한 레코드 수 리턴(int형) > insert하다가 실패하명 0
			result = pstmt.executeUpdate();
			
			//////////////////////////////////////////////////////////
			sql = "insert into emp(empno, ename) values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname()); //한글은 항상 *2 + 4byte(영어기준)
			
			int cnt = pstmt.executeUpdate();
			
			result += cnt;
			con.commit();
			
		}catch (Exception e) {
			System.out.println("레코드추가 예외발생..."+e.getMessage());
			try {
				result=0; //초기화
				con.rollback();//예외가 발생하면 커밋안하고 롤벡
			} catch (Exception ee) {}
		}finally { //예외로 빠지든 안빠지든 실행되는 영역
			
			setClose();
		}
		return result; //이거왱..
		
	};

	//레코드 선택
	public List<EmpVO> allEmpSelect() {
		//vo들을 담을 arraylist 선언
		List<EmpVO> empList = new ArrayList<EmpVO>(); //ArrayList가 아닌 List를 선언 >> 상위 클래스
		
		try {
			getConn(); //DB연결
			String sql = "select empno, ename, job, hiredate, sal, comm "
					+ "from emp order by empno";
			pstmt = con.prepareStatement(sql); //물음표 없으니까 바로 실행하면됨
			
			//실행
			rs = pstmt.executeQuery();
			
			//next() : 위치를 이동하여 레코드가 있으면 true, 없으면 false
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1)); //rs.getInt("empno")
				vo.setEname(rs.getString(2)); //선택한 결과의 두번째 (DB에서 두번째 ㄴㄴ)
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getString(4));
				vo.setSal(rs.getDouble(5));
				vo.setComm(rs.getDouble(6));
				//컬렉션에 레코드 1개의 정보가 담긴 vo객체를 추가
				empList.add(vo); //vo객체에서 들고온 레코드 컬렉션에 추가
				
			}
			
			
		}catch(Exception e) {
			System.out.println("모든 레코드 선택 예외 발생...."+e.getMessage());
		}finally {
			setClose(); //DB 닫는 작업
		}
		return empList;
	}
	
	//사원번호에 해당하는 레코드 선택 (1개)
	public EmpVO oneSelect(int empno) {
		EmpVO vo = null;
		try {
			getConn();
			
			String sql = "select ename, job, sal, com from emp where emp empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno); //첫번째 물음표 자리
			
			rs = pstmt.executeQuery(); //실행
			
			if(rs.next()) {//선택된 레코드가 있으면
				vo = new EmpVO();
				vo.setEname(rs.getString(1));
				vo.setJob(rs.getString(2));
				vo.setSal(rs.getDouble(3));
				vo.setComm(rs.getDouble(4));
			}
			
		}catch(Exception e) {
			System.out.println("1개 레코드 선택 예외발생...."+e.getMessage());
		}finally {
			setClose(); //DB 닫는 작업
		}
		return vo;
	};
	
	//레코드 수정
	public int empUpdate(int empno, double sal) {
		int result = 0;
		try {
			getConn(); //DB연결
			String sql = "update emp set sal=? where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1,sal);
			pstmt.setDouble(2,empno);

			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("사원수정예외발생-->"+e.getMessage());
		}finally {
			setClose();
		}
		return result;
	}
	//레코드 삭제
	public int empDelete(int empno) {
		int result = 0;
		try {
			getConn();
			String sql = "delete from emp where empno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			result = pstmt.executeUpdate(); //몇개의 레코드가 삭제되었는지 리턴
		}catch(Exception e) {
			System.out.println("사원삭제 예외 발생.."+e.getMessage());
		}finally {
			setClose();
		}
		return result;
	}

}
