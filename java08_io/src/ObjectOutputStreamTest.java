import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		try {
			File f = new File("C://javaSrc/Object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			DataVO vo = new DataVO();
			vo.setUsername("손흥민");
			vo.setNum(19);
			Calendar now = Calendar.getInstance();
			now.set(2025, 9, 12);
			vo.setNow(now);
			
			List<String> lst = new ArrayList<String>();
			lst.add("박태환");
			lst.add("김연아");
			lst.add("김연경");
			lst.add("박지성");
			vo.setNames(lst);
			
			oos.writeObject(vo);
			oos.close();
			System.out.println("객체를 파일로 쓰기 완료...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ObjectOutputStreamTest();
	}
}
