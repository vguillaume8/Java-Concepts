package towersOfHanoi;

public class towersOfHanoi {
	
	private int totalDisks;
	
	// sets up puzzle with specefied number of disks
	public towersOfHanoi(int disks) {
		totalDisks = disks;
	}
	
	// performs the initial call to move tower to solve the puzzle
	// moves the disks from tower 1 to tower 3 using tower 2
	
	public void solve() {
		moveTower(totalDisks, 1, 3, 2);
	}
	
	// moves the specified number of disks from one tower to another
	// by moving a subtower of n-1 disks out of the way, moving one
	// disk, then moving the subtower back. Base case of 1 disks.
	private void moveTower(int numDisks, int start, int end, int temp) {
		if(numDisks == 1) {
			moveOneDisk(start, end);
		} else {
			moveTower(numDisks-1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks-1, temp, end, start);
		}
	}
	
	// prints instructions to move one disk from the specified 
	// start tower to the specified end tower
	private void moveOneDisk(int start, int end) {
		System.out.println("Move one disk from " + start + "to" + end);
	}

}
