
// 2. ������ �Է¹޾� �Է� ���� ������ ��ü��, Ȧ����, ¦������ ���Ͽ� ����϶�.
public class Assignment02 {

	public static void main(String[] args) {
		
		// ���� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("����=");
		int num = scan.nextInt();
		
		// ����,Ȧ����,¦���� ���� ���� ����
		int total = 0;
		int odd   = 0;
		int even  = 0;
		
		//��ü,¦��,Ȧ�� ������ ����
		for(int i=0;i<=num;i++) {
			total += i;
			
			if(i%2==0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.printf("��ü��=%d\nȦ����=%d\n¦����=%d",total,odd,even);
	}

}
