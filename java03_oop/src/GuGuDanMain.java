
public class GuGuDanMain {
	
	public static void main(String[] args) {
		GuGuDan gugu = new GuGuDan();
		gugu.allGugudan();
		gugu.gugudan(10);
	
		int d = gugu.consoleInput("단을입력하세요..");
		gugu.gugudan(d);
		
	}
}
