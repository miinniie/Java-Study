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
			vo.setUsername("�����");
			vo.setNum(19);
			Calendar now = Calendar.getInstance();
			now.set(2025, 9, 12);
			vo.setNow(now);
			
			List<String> lst = new ArrayList<String>();
			lst.add("����ȯ");
			lst.add("�迬��");
			lst.add("�迬��");
			lst.add("������");
			vo.setNames(lst);
			
			oos.writeObject(vo);
			oos.close();
			System.out.println("��ü�� ���Ϸ� ���� �Ϸ�...");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ObjectOutputStreamTest();
	}
}
