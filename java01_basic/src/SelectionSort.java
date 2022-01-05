import java.util.Random;
import java.util.Scanner;


public class SelectionSort {
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� ���� �迭�� �ְڽ��ϱ�?(�Է��� �� ��ŭ 1~100������ ���� ����)=");
		int count = scan.nextInt();
		
		//���� ����: �����ε������� ���������� ���Ͽ� �ּڰ��� �׻� �Ǿտ� �δ� ���
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
		for(int offset=0; offset<data.length-1;offset++) {
			int offset_minValue = offset;
			
			for(int num=offset+1; num<data.length; num++) {
				if(data[num]<data[offset_minValue]) {
					offset_minValue = num;
				}			
			}
			int temp = data[offset_minValue]; //�ӽú����� ����� ���� �������� ������ �����
			data[offset_minValue]=data[offset];
			data[offset]=temp;
			
			System.out.println("\n=====������======");
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