import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {

	public BufferReaderTest() {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//���ۿ��� 1���� ���ڿ��� ���� �� �ִ� �޼ҵ带 �������ش�.
		BufferedReader br = new BufferedReader(isr);
		
		try {
			
			String inData = br.readLine(); //exception ó�� �������
			System.out.println(inData);
			
			
//			BufferedInputStream bis = new BufferedInputStream(System.in);
//			byte[] data = new byte[50];
//			
//			//input�� byte���� ���Ѵ�.
//			int size = bis.read(data);
//			
//			//byte�迭�� ���ڿ��� ��ȯ
//			String str = new String(data,0,size); //0���� ����������� ���
//			System.out.println(str);
			
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new BufferReaderTest();
		
	}
	

}
