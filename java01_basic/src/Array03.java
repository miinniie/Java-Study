import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ݾ�=");
		int money = Integer.parseInt(s.nextLine());
		
		// �迭�� �̿��Ͽ� ȭ�� ���� ���
		
		int won[] = {50000, 10000, 5000, 1000, 500, 100, 50 ,10 ,5, 1};
		for(int w: won) {
			int cnt = money/w;
			if(cnt>0) {
				System.out.print(w+"��->"+cnt);
				String danwi = "��";
				if (w>=1000) {
					danwi = "��";
				}
				System.out.println(danwi);
			}
			money -= w*cnt;
			
		}
		
		
	}
}
