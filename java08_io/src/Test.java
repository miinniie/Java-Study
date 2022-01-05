import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

	
public class Test {

		public Test() {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			//파일 만들기
			File file = new File("c://javaSrc/Memo.txt");
			
			try {
				FileOutputStream fos = new FileOutputStream(file);
				for(int cnt=0; cnt<5;cnt++) {
					String data = br.readLine();
					data = data + "\n";
					fos.write(data.getBytes());
				}
					
			}catch(IOException ie) {
					ie.printStackTrace();
			}
	
		}
		
		public static void main(String[] args) {
			new Test();
		
	}	
}
