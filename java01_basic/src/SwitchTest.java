
public class SwitchTest {

	public static void main(String[] args) {
		char data = '3';
		// data�� �ִ� ����  y-> yellow, r->red, b->blue, g->green�� ���ϰ�
		// �� �� ���ڴ� black�� ���϶�.
		String color;
		
		//switch�� �ȿ��� ����, ���, ������ �� �� ������ type�� short, int, boolean, string, char
		//�ַ� ������ ���� ������ (��Ȯ�� ��ġ�Ҷ�)
		switch(data) {
			case 'y':
				color = "yellow";
				break;
			case 'r':
				color = "red";
				break;
			case 'b':
				color = "blue";
				break;
			case 'g':
				color = "green";
				break;
			default:
				color = "black";
				
		}//switch 
		System.out.println(color);
	}

}
