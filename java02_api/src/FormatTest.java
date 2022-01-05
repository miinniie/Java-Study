import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public static void main(String[] args) {
		//��������� �̿��Ͽ� ������ ��ȯ�ϱ�
		//��¥
		Calendar now = Calendar.getInstance();
		
		//2021-11-26(��) 11:21:12(����)
		SimpleDateFormat frm = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a");
		String dateFrm = frm.format(now.getTime());
		System.out.println(dateFrm);
		
		//���������� ����
		// 235462 -> 2,354,862��
		int data = 2354862;
		DecimalFormat fmt2 = new DecimalFormat("#,###��"); //���ڰ� �� �ڸ��� #
		String deciData = fmt2.format(data);
		System.out.println(deciData);
		
		try {
			//����ȭ�� �����͸� ���������� ��ȯ
			NumberFormat nf = NumberFormat.getInstance(); //protected���� �Ǿ�����
			Number n = nf.parse(deciData);
			int won = n.intValue();
			System.out.println("won->" + won);
			
		}catch(ParseException pe) {
			System.out.println("���ڷ� ��ȯ���� ���Ͽ����ϴ�."+pe.getMessage());
		}
		
		
	}
}
