import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public static void main(String[] args) {
		//출력형식을 이용하여 정보를 반환하기
		//날짜
		Calendar now = Calendar.getInstance();
		
		//2021-11-26(금) 11:21:12(오전)
		SimpleDateFormat frm = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a");
		String dateFrm = frm.format(now.getTime());
		System.out.println(dateFrm);
		
		//숫자형식이 포멧
		// 235462 -> 2,354,862원
		int data = 2354862;
		DecimalFormat fmt2 = new DecimalFormat("#,###원"); //숫자가 들어갈 자리에 #
		String deciData = fmt2.format(data);
		System.out.println(deciData);
		
		try {
			//패턴화된 데이터를 원래정수로 변환
			NumberFormat nf = NumberFormat.getInstance(); //protected으로 되어있음
			Number n = nf.parse(deciData);
			int won = n.intValue();
			System.out.println("won->" + won);
			
		}catch(ParseException pe) {
			System.out.println("숫자로 변환하지 못하였습니다."+pe.getMessage());
		}
		
		
	}
}
