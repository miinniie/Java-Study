import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

public class DataVO implements Serializable{ //����ȭ�ϱ� ���ؼ�
	
	//ĸ��ȭ�� �������
	private Calendar now;
	private String username;
	private List<String> names;
	private int num;
	
	//���� VO�� ���ڵ� �ϳ��� ���� �� �ִ� ������ �����Ѵ�
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
