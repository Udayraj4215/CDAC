package in.person.address;

public class Address {
	private String Local;
	private int pincode;
	private String city;
	
	
	public Address() {
		this("",0,"");
	}
	
	public Address(String Local,int pincode,String city) {
		this.Local=Local;
		this.pincode=pincode;
		this.city=city;
	}
	
	
}
