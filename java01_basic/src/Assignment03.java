//3.구구단을 한줄에 3단 씩 출력하라

public class Assignment03 {

	public static void main(String[] args) {
		
		for(int k=1;k<=9;k++) {
			System.out.print("="+k+"단=\t"); //3개 출력 후 각 단의 구구단 출력
			
			if(k%3==0) {
				System.out.println(); //줄바꿈
				for(int i=1;i<=9;i++) { //3개가 한줄에 9번 반복
					for(int j=1;j<=3;j++) {
						System.out.print(j+"*"+i+"="+j*i+"\t");
						if(j%3==0) {
							System.out.println();
						}
					}
				}
				System.out.println(); //줄바꿈
			}
		}	
		
	}
}
