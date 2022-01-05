import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public FileCopy() {
		//���� ����
		File oriFile = new File("c://javaSrc/flower.jfif"); //�б�
		File tarFile = new File("c://test/flowerCopy.jfif"); //����
		
		try {
			FileInputStream fis = new FileInputStream(oriFile);
			FileOutputStream fos = new FileOutputStream(oriFile);
			
			//fis���� byte�� �о� fos����
			while(true) {
				int inData = fis.read();
				if(inData==-1)break;
				fos.write(inData);
			}
			System.out.println("������ ����Ǿ����ϴ�.");
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("������ �����.");
		}catch(IOException i) {
			System.out.println("����¿��ܹ߻�..");
		}
	}

	public static void main(String[] args) {
		new FileCopy();
		
	}
}
