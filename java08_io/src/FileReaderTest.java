import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {

		File file = new File("c://javaSrc/");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*
			while(true) {
				String str = br.readline();
				if(str==null)break; //읽어온 데이터가 없을 경우
				System.out.println(str);
			}
			*/
			
			long size = file.length();
			char data[] = new char[(int)size];
			int readSize = fr.read(data,0,(int)size);
			//char 배열을 String으로 변환
			String s1 = new String(data); //방법1
			String s2 = String.valueOf(data); //방법2
			
		}catch(FileNotFoundException fnfe){
			System.out.println("파일이 없습니다");
		}catch(IOException ie){
			System.out.println("파일 읽기 예외 발생..");
		}
	}

	public static void main(String[]  args) {
		new FileReaderTest();
	}

}
