import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamTest {
	
	public InputStreamTest() {
		InputStream is = System.in;
		try {
//			while(true) {
//				//read��� �޼ҵ�� ���� byte�� �������� -1�� ���ϵ�
//				
//				int data = is.read(); //�ܼ�(InputStream)���� 1byte(input) <-> ���� ����(read)�� �о����
//				//read�� ���� Ÿ���� int��
//				if(data==-1) {
//					break;
//				}
//				System.out.println(data); //�ƽ�Ű �ڵ尡 ���� >> enter�� 13, 10 //�ѱ��� �� ������ ���� >> 1byte�� �а� �ֱ� ����
//				System.out.println((char)data);
//			}	
			
			//���ڴ����� �о����
			InputStreamReader isr = new InputStreamReader(System.in);
			while(true) {
				int readerData = isr.read();
				if(readerData==-1) {
					break;
				}
				System.out.println(readerData);
				System.out.println((char)readerData);
			}
			
			
		}catch(IOException ie){
			System.out.println("byte�Է� ���� �߻�->" +ie.getMessage());
		}
	
	}
	
	public static void main(String[] args) {
		new InputStreamTest();
		
	}
}
