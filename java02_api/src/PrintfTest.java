
public class PrintfTest {

	public static void main(String[] args) {
		// System.out.printf(): 출력형 만들기
		int a = 100;
		int b = 200;
		
		// \n (new line), \t (tab), \"(진짜 다운표 출력), \'
		// %d (decimal..? = int), %f(float = double), %s (string)
		System.out.println(a+"\t\"b\"="+b);
		System.out.printf("a값=%10d \t%d\n", a,b); // 출력물 포맷을 잡아준다
		
		double c = 10/3.0;
		System.out.printf("%10.1f\n", c); //10자리 (점 포함) 출력 + 소수이하 한자리 출력
	}

}
