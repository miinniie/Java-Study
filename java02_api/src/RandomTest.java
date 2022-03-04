import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random ran = new Random();
		
		for(int i=1; i<=100; i++) {
			//boolean b = ran.nextBoolean();
			//double b = ran.nextDouble();
			int b = ran.nextInt();
			
			System.out.println(b+"\t");
			if(i%5==0)System.out.println();
		}
	}

}
