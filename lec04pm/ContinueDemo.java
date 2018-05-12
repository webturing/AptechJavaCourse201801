package lec04pm;

public class ContinueDemo {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {		
			if(i==5)
				continue;
			
			i++;
			System.out.print(i);	
		}

	}
}
