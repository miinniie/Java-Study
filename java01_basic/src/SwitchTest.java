
public class SwitchTest {

	public static void main(String[] args) {
		char data = '3';
		// data에 있는 값이  y-> yellow, r->red, b->blue, g->green을 구하고
		// 그 외 문자는 black을 구하라.
		String color;
		
		//switch문 안에는 변수, 상수, 수식이 들어갈 수 있으며 type은 short, int, boolean, string, char
		//주로 범위가 없는 데이터 (정확히 일치할때)
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
