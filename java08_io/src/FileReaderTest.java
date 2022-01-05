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
				if(str==null)break; //�о�� �����Ͱ� ���� ���
				System.out.println(str);
			}
			*/
			
			long size = file.length();
			char data[] = new char[(int)size];
			int readSize = fr.read(data,0,(int)size);
			//char �迭�� String���� ��ȯ
			String s1 = new String(data); //���1
			String s2 = String.valueOf(data); //���2
			
		}catch(FileNotFoundException fnfe){
			System.out.println("������ �����ϴ�");
		}catch(IOException ie){
			System.out.println("���� �б� ���� �߻�..");
		}
	}

	public static void main(String[]  args) {
		new FileReaderTest();
	}

}
