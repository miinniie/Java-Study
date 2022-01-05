import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File 클래스 : 드라이브명, 경로명, 파일명으로 객테를 생성하고
		//            반드시 경로는 절대주소이여야한다.
	
		File f1 = new File("C://test2/aaaa");
		//파일 또는 경로가 있는지 확인하는 곳
		//폴더 또는 파일이 있으면 true, 없으면 false
		if(f1.exists()) {
			System.out.println("폴더가 존재합니다");
		}else {
			System.out.println("폴더가 존재하지 않습니다.");
			f1.mkdirs(); //mkdir이 아닌 mkdirs()로 하면은 C://test2/aaaa 의 폴더가 두개가 생성됨(하위 폴더까지) 
		}
		
		File f2 = new File("c://javaSrc/Test.java");
		File f3 = new File(f1,"sample.txt");
		
		//파일경로, 파일명
		// getPath(): 파일경로(드라이브명 포함) + 파일명
		// getName(): 파일명
		// getAbsolutePath(): 파일경로 + 파일명
		// getParent(): 파일경로만
		
		System.out.println("getPath->" + f2.getPath()); //파일경로 + 파일명
		System.out.println("getName->" + f2.getName()); //파일명
		System.out.println("getParent->"+f2.getParent()); //파일경로
		
		//파일의 마지막 수정을 구하라.
		long date = f2.lastModified();
		System.out.println("date->"+date); //밀리초 정수로 나옴
		
		//
		Calendar nowDate = Calendar.getInstance();
		nowDate.setTimeInMillis(date);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		fmt.format(nowDate.getTime());
		String lastEditDate = fmt.format(nowDate.getTime());
		System.out.println("lastEditDate->"+lastEditDate);
		
		File f4 = new File("c://");
		
		//c드라이브의 폴더와 파일목록을 얻어오기
		File list[] = f4.listFiles();
		for(File f:list) {
			String pathName = f.getPath();
			if(f.isDirectory()) { //폴더
				if(f.isHidden()) { //숨김
					System.out.println(pathName+"[숨김폴더]");
				}else {//숨긴파일 아님
					System.out.println(pathName+"[폴더]");
				}
			}else {//파일
				if(f.isHidden()) {//숨김파일
					System.out.println(pathName+"[숨김파일]");
				}else {
					System.out.println(pathName+"[파일]");
				}
			}
			
		}
		
		//현재 시스템의 하드드라이브 정보 얻어오기
		File[] root = File.listRoots();
		for(File f:root) {
			System.out.println(f.getPath());
		}
		
		//파일의 생성
		long byteSize = f2.length();
		System.out.println("파일크기->"+byteSize);
		try {
			//파일생성
			f3.createNewFile();
		}catch(IOException e){}
		
		//파일의 삭제
		f3.delete();
		
		//파일 입출력
		
	}
	
	public static void main(String[] args) {
		new FileTest();
		
	}

}
