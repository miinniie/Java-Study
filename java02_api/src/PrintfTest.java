
public class PrintfTest {

	public static void main(String[] args) {
		// System.out.printf(): ����� �����
		int a = 100;
		int b = 200;
		
		// \n (new line), \t (tab), \"(��¥ �ٿ�ǥ ���), \'
		// %d (decimal..? = int), %f(float = double), %s (string)
		System.out.println(a+"\t\"b\"="+b);
		System.out.printf("a��=%10d \t%d\n", a,b); // ��¹� ������ ����ش�
		
		double c = 10/3.0;
		System.out.printf("%10.1f\n", c); //10�ڸ� (�� ����) ��� + �Ҽ����� ���ڸ� ���
	}

}
