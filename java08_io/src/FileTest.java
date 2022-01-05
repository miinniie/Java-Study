import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File Ŭ���� : ����̺��, ��θ�, ���ϸ����� ���׸� �����ϰ�
		//            �ݵ�� ��δ� �����ּ��̿����Ѵ�.
	
		File f1 = new File("C://test2/aaaa");
		//���� �Ǵ� ��ΰ� �ִ��� Ȯ���ϴ� ��
		//���� �Ǵ� ������ ������ true, ������ false
		if(f1.exists()) {
			System.out.println("������ �����մϴ�");
		}else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			f1.mkdirs(); //mkdir�� �ƴ� mkdirs()�� �ϸ��� C://test2/aaaa �� ������ �ΰ��� ������(���� ��������) 
		}
		
		File f2 = new File("c://javaSrc/Test.java");
		File f3 = new File(f1,"sample.txt");
		
		//���ϰ��, ���ϸ�
		// getPath(): ���ϰ��(����̺�� ����) + ���ϸ�
		// getName(): ���ϸ�
		// getAbsolutePath(): ���ϰ�� + ���ϸ�
		// getParent(): ���ϰ�θ�
		
		System.out.println("getPath->" + f2.getPath()); //���ϰ�� + ���ϸ�
		System.out.println("getName->" + f2.getName()); //���ϸ�
		System.out.println("getParent->"+f2.getParent()); //���ϰ��
		
		//������ ������ ������ ���϶�.
		long date = f2.lastModified();
		System.out.println("date->"+date); //�и��� ������ ����
		
		//
		Calendar nowDate = Calendar.getInstance();
		nowDate.setTimeInMillis(date);
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		fmt.format(nowDate.getTime());
		String lastEditDate = fmt.format(nowDate.getTime());
		System.out.println("lastEditDate->"+lastEditDate);
		
		File f4 = new File("c://");
		
		//c����̺��� ������ ���ϸ���� ������
		File list[] = f4.listFiles();
		for(File f:list) {
			String pathName = f.getPath();
			if(f.isDirectory()) { //����
				if(f.isHidden()) { //����
					System.out.println(pathName+"[��������]");
				}else {//�������� �ƴ�
					System.out.println(pathName+"[����]");
				}
			}else {//����
				if(f.isHidden()) {//��������
					System.out.println(pathName+"[��������]");
				}else {
					System.out.println(pathName+"[����]");
				}
			}
			
		}
		
		//���� �ý����� �ϵ����̺� ���� ������
		File[] root = File.listRoots();
		for(File f:root) {
			System.out.println(f.getPath());
		}
		
		//������ ����
		long byteSize = f2.length();
		System.out.println("����ũ��->"+byteSize);
		try {
			//���ϻ���
			f3.createNewFile();
		}catch(IOException e){}
		
		//������ ����
		f3.delete();
		
		//���� �����
		
	}
	
	public static void main(String[] args) {
		new FileTest();
		
	}

}
