import java.util.Random;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		Random ran = new Random();
		//�迭�� �̿��Ͽ� ������ ������������ �����϶�.
		
		//1~100�� ������ 10�� �����Ѵ�.
		int data[] = new int[10];
		for (int idx=0; idx<data.length; idx++) {
			data[idx] = ran.nextInt(100)+1;
		}
		
		System.out.println("=====������======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
//		int cnt = 0;
		
		for(int j=0; j<data.length-1;j++) {
			//���� ����
			for(int i=0; i<data.length-1-j; i++) {
				//System.out.println(++cnt);
				if(data[i]>data[i+1]) {
					int temp = data[i]; //�ӽú����� ����� ���� �������� ������ �����
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
		}
		
		System.out.println("\n=====������======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
		
		
	}
}
