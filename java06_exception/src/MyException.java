//����� ���� ����ó�� Ŭ���� �����

//����1. Exception (�������̽��� �ƴ϶� Ŭ������)���
public class MyException extends Exception {
	MyException(){
		//���� Ŭ������ Exception�� ������ �޼ҵ带 ȣ���Ͽ�
		//���� �޼����� �����Ѵ�.
		super("1~100������ ���� �ƴϴ�.");
	}
	public MyException(String message) {
		super(message);
	}
	
}
