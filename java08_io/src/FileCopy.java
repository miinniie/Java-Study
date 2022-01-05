import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		//파일 복사
		File oriFile = new File("c://javaSrc/flower.jfif"); //읽기
		File tarFile = new File("c://test/flowerCopy.jfif"); //복사
		
		try {
			FileInputStream fis = new FileInputStream(oriFile);
			FileOutputStream fos = new FileOutputStream(oriFile);
			
			//fis에서 byte를 읽어 fos쓰기
			while(true) {
				int inData = fis.read();
				if(inData==-1)break;
				fos.write(inData);
			}
			System.out.println("파일이 복사되었습니다.");
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 없어요.");
		}catch(IOException i) {
			System.out.println("입출력예외발생..");
		}
	}

	public static void main(String[] args) {
		new FileCopy();
		
	}
}
