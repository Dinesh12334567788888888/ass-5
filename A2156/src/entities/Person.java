package entities;


public class Person {

	private Name name;
	private String perCode;
	private Email email;
	private Address address;
	// Person class owns Address class as a field

	public Person(String perCode, Name name, Address address, Email email) {
		super();
		this.perCode = perCode;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getPerCode() {
		return perCode;
	}

	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}