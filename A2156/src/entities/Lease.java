package entities;


public class Lease extends Agreement {
	String code;
	String proType;
	String startDate;
	String endDate;
	String customerName;
	String deposit;
	String monthlyCost;
	Address address;
	

	public Lease(String code, String proType, String startDate, String endDate, Address address,
			String customerName, String deposit, String monthlyCost) {
		
		this.code = code;
		this.proType = proType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.customerName = customerName;
		this.deposit = deposit;
		this.monthlyCost = monthlyCost;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(String monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

	@Override
	public double GetTax(double subtotal) {
		
		return 0;
	}

	@Override
	public double ComputeGrandTotal(double tax, double subtotal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ComputeSubTotal(String n, String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}