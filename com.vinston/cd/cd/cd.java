package cd;

public class cd {
	
	private String title, artist;
	private double cost;
	private int tracks;
	
	// Creates a new CD with the specified information
	public cd(String name, String singer, double price, int numTracks) {
		title = name;
		artist = singer;
		cost = price;
		tracks = numTracks;
	}
	
	// Returns a description of this CD.
	public String toString() {
		String description;
		
		description = "\n cost: " + cost + "\t tracks:" + tracks + "\t";
		description += title + "\t" + artist;
		
		return description;
	}

}
