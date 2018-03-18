package boat;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer first = new Customer("Eleanor", "Alanta", "123-4567");
		Customer second = new Customer("JoAnn", "St Louis", "987-6543");
		
		boat firstBoat = new boat("M034561", 28, "Tartan", 2002, first);
		boat secondBoat = new boat("M098765", 32, "Catalina", 2001, second);
		
		System.out.println(firstBoat.tellAboutSelf());
		System.out.println(secondBoat.tellAboutSelf());
	}

}
