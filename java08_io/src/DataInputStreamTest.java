import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;


public class DataInputStreamTest {

	public DataInputStreamTest() {
		try {
			//파일에서 데이터형으로 읽어오기
			File f = new File ("C://javaSrc/data.txt");
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			int intData = dis.readInt(); //4byte읽음
			double dblData = dis.readDouble(); //8byte읽음
			char charData = dis.readChar(); //1~2byte(한글)
			boolean booData = dis.readBoolean(); //	1byte
			
			byte[] byteData = new byte[100];
			int cnt = dis.read(byteData);
			String strData = new String(byteData);
			
			System.out.println("int->"+intData);
			System.out.println("double->"+dblData);
			System.out.println("char->"+charData);
			System.out.println("boolean->"+booData);
			System.out.println("String->"+strData);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new DataInputStreamTest();
	}

}
