import java.util.Scanner;

public class ExceptionTest2 {
	
	public void start() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("�����Է�=");
			int num = Integer.parseInt(scan.nextLine()); //////
			
			System.out.print("�����Է�=");
			int num2 = Integer.parseInt(scan.nextLine()); /////
			
			int result = num/num2; //////
			System.out.printf("%d / %d = %d\n", num, num2, result);
			
			int arr[] = new int[5];
			arr[arr.length] = 100; //////
			
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae.getMessage());
			
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� ���ڷ� �ٲ� �� ����");
			
		}catch(Exception e) {
			//Exception�� ����Ŭ�����̱� ������ ��� ���ܸ� ������ �� �ִ�.
			e.printStackTrace();
		}finally {
			//���ܰ� �߻��ϵ� ���ϵ� ����ȴ�.
			System.out.println("finally �����..");
			try {
				
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new ExceptionTest2().start();
	
	}
}
