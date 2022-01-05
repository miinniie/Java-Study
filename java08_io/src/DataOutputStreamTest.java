import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		//기본데이터형인 byte, short, int, long, float, double
		//char,boolean의 메모리 크기만큼 공간을 확보하여 값1을 파일로 쓰기한다.
		int intData = 1254887;
		double dblData = 2562.2451;//8byte
		char charData = '홍';
		boolean booData = true;
		
		try {
			File f = new File("C://javaSrc","data.txt");
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(intData);
			dos.writeDouble(dblData);
			dos.writeChar(charData);
			dos.writeBoolean(booData);
			//byte배열로 변경하여 파일에 쓰기를 한다.
			String txt = "DataInputStream에 문자열쓰기";
			dos.write(txt.getBytes());
			dos.close();
			
		}catch(Exception e) {
			System.out.println("예외발생-->"+e.getMessage());
		}
		System.out.println("파일쓰기가 완료되었습니다.");
	}

	public static void main(String[] args) {
		new DataOutputStreamTest();
	}

}
