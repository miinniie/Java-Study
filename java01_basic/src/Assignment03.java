//3.�������� ���ٿ� 3�� �� ����϶�

public class Assignment03 {

	public static void main(String[] args) {
		
		for(int k=1;k<=9;k++) {
			System.out.print("="+k+"��=\t"); //3�� ��� �� �� ���� ������ ���
			
			if(k%3==0) {
				System.out.println(); //�ٹٲ�
				for(int i=1;i<=9;i++) { //3���� ���ٿ� 9�� �ݺ�
					for(int j=1;j<=3;j++) {
						System.out.print(j+"*"+i+"="+j*i+"\t");
						if(j%3==0) {
							System.out.println();
						}
					}
				}
				System.out.println(); //�ٹٲ�
			}
		}	
		
	}
}
