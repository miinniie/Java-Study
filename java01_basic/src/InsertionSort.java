import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� ���� �迭�� �ְڽ��ϱ�?(�Է��� �� ��ŭ 1~100������ ���� ����)=");
		int count = scan.nextInt();
		
		//���� ����: ���� ��ġ���� �Ʒ������� ��ȸ�ϸ� �˸��� ��ġ�� ����
		//1~100������ �Է��� �� ��ŭ�� ���� ����
		int data[] = new int[count];
		for (int idx=0; idx<data.length; idx++) {
			data[idx] = ran.nextInt(100)+1;
		}
		
		System.out.println("=====������======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
		
		//���� ���� ����
		for(int idx=1; idx<data.length; idx++) {
			int currentValue = data[idx];
			int position = idx;
			
			while(position>0 && data[position-1]>currentValue) {
				data[position] = data[position-1];
				position--;
			}
			data[position]=currentValue;
			
			System.out.printf("\n=====����%d======\n",idx);
			for(int d : data) {
				System.out.print(d+"\t");
			}
		}
		
		//������ �ɶ����� ���
		System.out.println("\n=====����(������ ���)======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
	
	}
}
