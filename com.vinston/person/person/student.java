package person;

public class student extends person {
	
	private int studentNumber;
	
	public student() {
		super();
		studentNumber = 0; // Indicating no number yet
	}
	
	public student(String initialName, int initialStudentNumber) {
		super(initialName);
		studentNumber = initialStudentNumber;
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
 
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student Number: " + studentNumber);
	}
	
	public boolean equals(student otherStudent) {
		return (this.sameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber));
	}
	
	public String toString() {
		return ("Name: " + getName() + "\nStudent number: " + studentNumber );
	}
}
