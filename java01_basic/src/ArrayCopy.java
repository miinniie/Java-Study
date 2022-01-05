
public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		int oriArr[] = {5,10,7,2,1};
		int tarArr[] = new int[10];
		
		//원본 배열명, 시작idx, 타겟배열명, 복사의 시작 idx, 갯수
		System.arraycopy(oriArr, 0, tarArr, 3, 4);
		
		for(int i=0;i<tarArr.length;i++) {
			System.out.println(tarArr[i]);
		}
	}

}
