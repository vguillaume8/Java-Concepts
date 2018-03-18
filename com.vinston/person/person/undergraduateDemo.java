package person;

public class undergraduateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		undergraduate ug1 = new undergraduate("James Bond", 007, 1);
		ug1.writeOutput();
		ug1.reset("Sam Spade", 1940, 2);
		System.out.println("ug1 is:");
		ug1.writeOutput();
		
		undergraduate ug2 = new undergraduate("James Bond", 007, 1);
		System.out.println("ug2 is:");
		ug2.writeOutput();
		if(ug1.equals(ug2)) {
			System.out.println("Same students");
		} else {
			System.out.println("Not the same students");
		}
		
		if(ug1.sameName(ug2)) {
			System.out.println("Same names.");
		}else {
			System.out.println("Not the same names.");
		}
				
		

	}

}
