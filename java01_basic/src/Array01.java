
public class Array01 {

	public static void main(String[] args) {
		// �迭�̶� ���� ������������ ������ ������ �ʿ��� �� �����Ѵ�.
		int num[] = new int[10];
		String names[] = new String[10];
		
		int tel[];
		tel = new int[5];
		
		//�迭�� �� �Է��ϱ�
		num[3]=100;
		
		//System.out.println(num);
		// �迭�� ũ�� ���ϱ� -> �迭��.length
		for(int idx=0;idx<num.length;idx++) {
			System.out.println("num["+idx+"]="+num[idx]);
		}
		
		//���ڿ� �迭�� �ʱⰪ�� Ȯ��
		//Ȯ��� for��(�ʱ� �����Ͱ� ���� ����) -> for(�迭�� ������ Ÿ�Ժ���:�迭��)
		System.out.println("================");
		for(String n:names) {
			System.out.println(n);
		}
		
		//�迭 ������ �ʱ� �����͸� �����ϱ�
		//����:0, �Ǽ�: 0.0, ��: false, char: , String: null
		
		int data[] = {19,54,75,48,65,58};
		System.out.println("================");
		
		
		//�迭�� ���� �̿��� �� ���ϱ�
		int tot =0;
		for(int idx = 0; idx<data.length; idx++) {
			tot += data[idx];
			System.out.println("data["+idx+"]="+data[idx]);
		}
		System.out.println("��="+tot);
		
		
		System.out.println("================");
		
		//�ִ밪�� ������ ������ �迭�� index 0��° �����͸� �����Ѵ�.
		int max = data[0];
		for(int idx = 1; idx<data.length; idx++) {
			if(max<data[idx]){
				max = data[idx];
			}
		}
		System.out.println("�ִ�="+max);
		
		
		System.out.println("================");
		
		//�ִ밪�� ������ ������ �迭�� index 0��° �����͸� �����Ѵ�.
		
		
	}
}
