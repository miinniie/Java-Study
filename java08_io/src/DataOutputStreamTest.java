import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		//�⺻���������� byte, short, int, long, float, double
		//char,boolean�� �޸� ũ�⸸ŭ ������ Ȯ���Ͽ� ��1�� ���Ϸ� �����Ѵ�.
		int intData = 1254887;
		double dblData = 2562.2451;//8byte
		char charData = 'ȫ';
		boolean booData = true;
		
		try {
			File f = new File("C://javaSrc","data.txt");
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(intData);
			dos.writeDouble(dblData);
			dos.writeChar(charData);
			dos.writeBoolean(booData);
			//byte�迭�� �����Ͽ� ���Ͽ� ���⸦ �Ѵ�.
			String txt = "DataInputStream�� ���ڿ�����";
			dos.write(txt.getBytes());
			dos.close();
			
		}catch(Exception e) {
			System.out.println("���ܹ߻�-->"+e.getMessage());
		}
		System.out.println("���Ͼ��Ⱑ �Ϸ�Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		new DataOutputStreamTest();
	}

}
