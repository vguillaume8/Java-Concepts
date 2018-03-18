package lab_1;
import java.util.Random;


public class lab_1 {
	public static void main(String[] args) {
		Random generator = new Random();
		int x[] = new int[50];
		int y[] = new int[50];
		
		for(int i = 0; i < 51; i++) {
			int n = generator.nextInt(21);
			x[i] = n;
		}
		
		for(int i = 0; i < 51; i++) {
			int n = generator.nextInt(21);
			y[i] = n;
		}
		
		int a[] = new int[50];
		
		for(int i = 0; i < 51; i++) {
			
			for(int j = 0; j< 51; j++) {
				if(x[i] == y[i]) {
					a[i] = x[i];
				}
			}
		}

		
	}
	
}

