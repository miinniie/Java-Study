
public class ArrayCopy {

	public static void main(String[] args) {
		// �迭�� ����
		int oriArr[] = {5,10,7,2,1};
		int tarArr[] = new int[10];
		
		//���� �迭��, ����idx, Ÿ�ٹ迭��, ������ ���� idx, ����
		System.arraycopy(oriArr, 0, tarArr, 3, 4);
		
		for(int i=0;i<tarArr.length;i++) {
			System.out.println(tarArr[i]);
		}
	}

}
