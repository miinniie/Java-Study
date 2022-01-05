import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		try {
			File f = new File("C://javaSrc/object.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataVO vo = (DataVO)ois.readObject();
			System.out.println("userName->"+vo.getUsername());
			System.out.println("num->"+vo.getNum());
			
			Calendar date = vo.getNow();
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = fmt.format(date.getTime());
			System.out.println("date->"+dateStr);
			
			for(String n: vo.getNames()) {
				System.out.println(n);
			}
		
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ObjectInputStreamTest();
	}

}
