import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class DataVO implements Serializable{ //직렬화하기 위해서
	
	//캡슐화된 멤버변수
	private Calendar now;
	private String username;
	private List<String> names;
	private int num;
	
	//보통 VO는 레코드 하나를 담을 수 있는 변수를 선언한다
	public DataVO() {}

	public Calendar getNow() {
		return now;
	}

	public void setNow(Calendar now) {
		this.now = now;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
