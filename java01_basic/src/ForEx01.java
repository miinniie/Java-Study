import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("��=");
		int dan = scan.nextInt();
		
		for(int i=2;i<=9;i+=1) {
			System.out.println(dan+"*"+i +"="+dan*i);
		}
	}
}


/*
�ֿܼ��� ���� �Է¹޾� �ش��ϴ� ���� ����϶�.
����
��=8
8*2=16
8*3=24
8*4=32
8*5=35
8*6=42
8*7=56
.
.
8*9=72


*/