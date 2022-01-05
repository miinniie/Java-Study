import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	static {//��ü�� �����Ǹ� �Բ� ����ȴ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("����̺�ε� ����..."+cnfe.getMessage());
		}
	}
	//�������
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//DB����
	public void getConn() {
		// DriverManager: DB�� �����ϴ� Ŭ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //�����ͺ��̽��� �� ���Ŀ� ���� ǥ���ϴ� ��Ī�� �ٸ��� (jdbc:oracle:thin:@ȣ��Ʈ�̸�:��Ʈ��ȣ:SID���������̸�)
		try {
			con = DriverManager.getConnection(url,"c##scott","tiger");
		} catch (SQLException se) {
			System.out.println("DB���� ���� �߻�..."+se.getMessage());;
		}
		
		
	}
	
	//DB����
	public void setClose() {
		try {
			if(rs!=null)rs.close(); //rs�� ����ߴٸ���
			if(pstmt!=null)pstmt.close(); //��ü ������ ����������
			//������ ���ϰ�(conn default�� null)  �������� �־
			if(con!=null) con.close(); //db �������
		} catch (Exception e) {
			System.out.println("DB�������� ���ܹ߻�..."+e.getMessage());
		} 
	}

}
 