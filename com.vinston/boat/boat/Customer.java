package boat;

public class Customer {

	// attribute definitions
	private String name;
	private String address;
	private String phoneNo;
	
	// reference variable for Boat instance
	private boat boat;
	
	// constructor with parameters
	public Customer(String aName, String anAddress, String aPhoneNo) {
		// invoke accessors to populate attributes
		setName(aName);
		setAddress(anAddress);
		setPhoneNo(aPhoneNo);
		
		// initally no Boat
		setBoat(null);
	}
	
	// get accessors
	public String getName() { 
		return name;
	}
	public String getAddress() { 
		return address;
	}
	public String getPhoneNo() { 
		return phoneNo;
	}
	public boat getBoat() { 
		return boat;
	}
	
	// set accessors
	public void setName(String newName) {
		name = newName;
	}
	public void setAddress(String newAddress) { 
		address = newAddress;
	}
	public void setPhoneNo(String newPhoneNo) { 
		phoneNo = newPhoneNo;
	}
	public void setBoat(boat aBoat) {
		boat = aBoat;
	}
	
}
