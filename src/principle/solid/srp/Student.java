package principle.solid.srp;

public class Student {
	
	private String name;
	private int id;
	private Address address;
	
	public Student(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	// violates SRP
	public boolean verifyAddress() {
		if(address != null) {
			return address.getStreet().length() > 2;
		}
		return false;
	}

}
