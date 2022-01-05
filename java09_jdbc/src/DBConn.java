import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	static {//객체만 생성되면 함꼐 실행된다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("드라이브로딩 에러..."+cnfe.getMessage());
		}
	}
	//멤버변수
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//DB연결
	public void getConn() {
		// DriverManager: DB를 연결하는 클래스
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //데이터베이스를 뭘 쓰냐에 따라서 표기하는 명칭이 다르다 (jdbc:oracle:thin:@호스트이름:포트번호:SID전역변수이름)
		try {
			con = DriverManager.getConnection(url,"c##scott","tiger");
		} catch (SQLException se) {
			System.out.println("DB연결 예외 발생..."+se.getMessage());;
		}
		
		
	}
	
	//DB종료
	public void setClose() {
		try {
			if(rs!=null)rs.close(); //rs를 사용했다면은
			if(pstmt!=null)pstmt.close(); //객체 생성에 성공했을시
			//연결을 안하고서(conn default는 null)  끊을수도 있어서
			if(con!=null) con.close(); //db 연결끊기
		} catch (Exception e) {
			System.out.println("DB연결종료 예외발생..."+e.getMessage());
		} 
	}

}
 