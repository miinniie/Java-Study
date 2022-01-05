import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterTest {

	public FileWriterTest() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		public FileWriterTest() {}
		
		static void start() {
			try {
				File f = new File("c://javaSrc/memo.txt");
				FileWriter fw = new FileWriter(f);
				
				for(int i=1; i<=5; i++) {
					String data = console(String.valueOf(i));
					fw.write(data);
				}
				fw.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	
	
			
		public String console(String msg) {
			String inData = null;
			try {
				System.out.print(msg+"번째 줄:");
				inData = br.readLine();
			}catch(Exception e) {
				System.out.println("콘솔입력에러....");
			}
			return inData;
		}
		
	


	public static void main(String[] args) {
		new FileWriterTest().start();
	}
}