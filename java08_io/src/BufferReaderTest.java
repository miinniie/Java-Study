import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {

	public BufferReaderTest() {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//버퍼에서 1줄의 문자열을 읽을 수 있는 메소드를 제공해준다.
		BufferedReader br = new BufferedReader(isr);
		
		try {
			
			String inData = br.readLine(); //exception 처리 해줘야함
			System.out.println(inData);
			
			
//			BufferedInputStream bis = new BufferedInputStream(System.in);
//			byte[] data = new byte[50];
//			
//			//input한 byte수를 구한다.
//			int size = bis.read(data);
//			
//			//byte배열을 문자열로 변환
//			String str = new String(data,0,size); //0부터 사이즈까지만 출력
//			System.out.println(str);
			
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new BufferReaderTest();
		
	}
	

}
