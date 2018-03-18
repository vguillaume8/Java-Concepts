package cd;
import java.util.ArrayList;

public class cdCollection {
	
	private ArrayList<cd> collection;
	private int count;
	private double totalCost;
	
	// Creates an intially empty collection
	public cdCollection() {
		collection = new ArrayList<cd>();
		count = 0;
		totalCost = 0.0;
	}
	
	// Adds a CD to the collection, increasing the size of the collection if neccessary
	public void addCD(String title, String artist, double cost, int tracks) {
		collection.add(new cd(title, artist, cost, tracks) );
		totalCost += cost;
		count++;
	}
	
	// Returns a report describing the CD collection
	public String toString() {
		String report = "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n";
	      report += "My CD Collection\n\n";

	      report += "Number of CDs: " + count + "\n";
	      report += "Total cost: " + totalCost + "\n";
	      report += "Average cost: " + totalCost / count ;

	      report += "\n\nCD List:\n\n";


	      for (int cd = 0; cd < collection.size(); cd++) {
	    	  
	    	  	report += collection.get(cd).toString() + "\n";
	      }
	      return report;
		
	}
	

}
