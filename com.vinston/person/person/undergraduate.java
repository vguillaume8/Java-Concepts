package person;

public class undergraduate extends student{
	
	private int level; // 1 for freshman, 2 for sophomore
	
	public undergraduate() {
		super();
		level = 1;
	}
	
	public undergraduate(String initialName, int initialStudentNumber, int initialLevel) {
		super(initialName, initialStudentNumber);
		setLevel(initialLevel);
	}
	
	public void reset(String newName, int newStudentNumber, int newLevel) {
		reset(newName, newStudentNumber);
		setLevel(newLevel);
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int newLevel) {
		if((1 <= newLevel) && (newLevel <= 4)) {
			level = newLevel;
		} else {
			System.out.println("Illegal level!");
			System.exit(0);
		}
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student Level: " + level);
	}
	
	public boolean equals(undergraduate otherUndergraduate) {
		return (super.equals(otherUndergraduate) && (this.level == otherUndergraduate.level));
	}

}
