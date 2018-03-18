package person;

public class person {
	private String name;
	
	public person() {
		name = "No name yet.";
	}
	
	public person(String initialName) {
		name = initialName;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void writeOutput() {
		System.out.println("Name: " + name);
	}
	
	public boolean sameName(person otherPerson) {
		return (this.name.equalsIgnoreCase(otherPerson.name));
	}

}
