package entities;

public  class LowIncome extends Customer{
	protected String name;
	protected Address address;
	protected String cusCode;
	protected static String type;
	protected String primaryContact;
	public LowIncome(String cusCode, String type, String primaryContact, String name, Address address) {
		super();
		this.cusCode = cusCode;
		this.type = type;
		this.primaryContact = primaryContact;
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public  String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	


	@Override
	public double GetTax(int tax) {
		return 0;
		
	}

	@Override
	public double GetDiscount(int price) {
		return (price * .10);
		
	}

	@Override
	public double GetAdditionalFees() {
		return 50.75;
		
	}
}
