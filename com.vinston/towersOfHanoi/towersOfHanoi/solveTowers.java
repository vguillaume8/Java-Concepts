package towersOfHanoi;
import java.util.Scanner;

public class solveTowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		towersOfHanoi towersOfHanoi = new towersOfHanoi(n);
		
		towersOfHanoi.solve();

	}

}
