import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("단=");
		int dan = scan.nextInt();
		
		for(int i=2;i<=9;i+=1) {
			System.out.println(dan+"*"+i +"="+dan*i);
		}
	}
}


/*
콘솔에서 만을 입력받아 해당하는 단을 출력하라.
실행
단=8
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