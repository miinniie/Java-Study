import java.io.File;

public class RandomAccessFile {

	public RandomAccessFile() {
		
//		new RandomAccessFile(int, String);
		try{
			//RandomAccessFile: 입력 출력을 같이 할 수 있는 객체
			File f = new File("c://javaSrc/access.txt");
			//mode: w-> 쓰기전용, r-> 읽기 전용, rw-> 읽기쓰기가능
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			
			/*
//			String txt = "Java inputoutputStream test";
//			raf.writeBytes(txt);
			
			raf.seek(5);
			raf.writeBytes("RandomAccessFile");
			
			//마지막에 쓰기
			raf.seek(f.length());//커서의 위치를 파일의 크기만큼 옮김
			raf.writeInt(123456);
			
			raf.close();
			System.out.println("쓰기완료...");
			*/
			
			byte[] inData = new byte[(int)f.length()];
			raf.seek(0);
			int cnt = raf.read(inData);
			System.out.println("inData->" + new String(inData));
			
			raf.seek(27);
			int intData = raf.readInt;
			System.out.println("inData->" + new String(inData));
			
			
			raf.close();
			System.out.println("쓰기완료...");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new RandomAccessFile();
	}

}
