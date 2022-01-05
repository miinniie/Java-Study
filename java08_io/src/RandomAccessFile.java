import java.io.File;

public class RandomAccessFile {

	public RandomAccessFile() {
		
//		new RandomAccessFile(int, String);
		try{
			//RandomAccessFile: �Է� ����� ���� �� �� �ִ� ��ü
			File f = new File("c://javaSrc/access.txt");
			//mode: w-> ��������, r-> �б� ����, rw-> �б⾲�Ⱑ��
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			
			/*
//			String txt = "Java inputoutputStream test";
//			raf.writeBytes(txt);
			
			raf.seek(5);
			raf.writeBytes("RandomAccessFile");
			
			//�������� ����
			raf.seek(f.length());//Ŀ���� ��ġ�� ������ ũ�⸸ŭ �ű�
			raf.writeInt(123456);
			
			raf.close();
			System.out.println("����Ϸ�...");
			*/
			
			byte[] inData = new byte[(int)f.length()];
			raf.seek(0);
			int cnt = raf.read(inData);
			System.out.println("inData->" + new String(inData));
			
			raf.seek(27);
			int intData = raf.readInt;
			System.out.println("inData->" + new String(inData));
			
			
			raf.close();
			System.out.println("����Ϸ�...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new RandomAccessFile();
	}

}
