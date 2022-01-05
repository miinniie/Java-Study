
public class ArrayBubbleString {

	public static void main(String[] args) {
		String names[] = {"손흥민","김연아","추신수","박지성","박태환","박찬욱","류현진","김연경"};
		
		System.out.println("\n=====정렬전======");
		for(String d : names) {
			System.out.print(d+"\t");
		}
		
		
		for(int j=0; j<names.length-1;j++) {
			//버블 정렬
			for(int i=0; i<names.length-1-j; i++) {
				//System.out.println(++cnt);
				if(names[i].compareTo(names[i+1])>0) {
					String temp = names[i]; //임시변수를 만들어 주지 않으면은 데이터 사라짐
					names[i]=names[i+1];
					names[i+1]=temp;
				}
			}
		}
		
		System.out.println("\n=====정렬후======");
		for(String d : names) {
			System.out.print(d+"\t");
		}
		
		
	}
}
