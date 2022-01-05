import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamTest {
	
	public InputStreamTest() {
		InputStream is = System.in;
		try {
//			while(true) {
//				//read라는 메소드는 읽은 byte가 없을떄는 -1이 리턴됨
//				
//				int data = is.read(); //콘솔(InputStream)에서 1byte(input) <-> 문자 단위(read)를 읽어오기
//				//read의 리턴 타입이 int임
//				if(data==-1) {
//					break;
//				}
//				System.out.println(data); //아스키 코드가 나옴 >> enter는 13, 10 //한글은 다 깨져서 나옴 >> 1byte씩 읽고 있기 때문
//				System.out.println((char)data);
//			}	
			
			//문자단위로 읽어오기
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
			System.out.println("byte입력 예외 발생->" +ie.getMessage());
		}
	
	}
	
	public static void main(String[] args) {
		new InputStreamTest();
		
	}
}
