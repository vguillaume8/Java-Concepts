package boat;

public class boat {
	
	// attributes
	private String stateRegistrationNo;
	private double length;
	private String manufacturer;
	private int year;
	
	// reference variable points to a Customer instance
	private Customer customer;
	
	// constructor now with customer reference
	public boat(String aStateRegistrationNo, double aLength, String aManufacturer, int aYear, Customer aCustomer) {
		setStateRegistrationNo(aStateRegistrationNo);
		setLength(aLength);
		setManufacturer(aManufacturer);
		setYear(aYear);
		
		// association between boat and customer done here
		assignBoatToCustomer(aCustomer);
	}
	
	// tellAboutSelf method returning Boat and Customer information
	public String tellAboutSelf() {
		String boatDetails = "I am a Boat" + "state reg number " + getStateRegistrationNo() + "length " + getLength() + "Manufacturer " + getManufacturer() + "Year " + getYear();
		String customerDetails = "\n and Owner is " + customer.getName() + " living in " + customer.getAddress() + " with phone " + customer.getPhoneNo();
		return boatDetails + customerDetails;
	}
	
	// custom method to assign a Boat to a Customer
	public void assignBoatToCustomer(Customer aCustomer) {
		setCustomer(aCustomer); // point Boat to the Customer instance
		customer.setBoat(this); // point Customer to this Boat
	}
	
	// set accessor methods
	public void setStateRegistrationNo(String aStateRegistrationNo) {
		stateRegistrationNo = aStateRegistrationNo;
	}
	public void setLength(double aLength) {
		length = aLength;
	}
	public void setManufacturer(String aManufacturer) { 
		manufacturer = aManufacturer; 
	}
	public void setYear(int aYear) {	
		year = aYear;  
	}
	public void setCustomer(Customer aCustomer) {	
		customer = aCustomer;  
	}
	
	// get accessor methods
	public String getStateRegistrationNo() { 
		return stateRegistrationNo;
	}
	public double getLength() { 
		return length; 
	}
	public String getManufacturer() { 
		return manufacturer; 
	}
	public int getYear() { 
		return year; 
	}
	public Customer getCustomer() { 
		return customer; 
	}
} 


