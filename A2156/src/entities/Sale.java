package entities;


public class Sale extends Agreement {
	String code;
	String proType;
	String startDate;
	String endDate;
	String customerName;
	Address address;
	String dateTime;
	String totalCost;
	String downPayment;
	String monthlyPayment;
	String payableMonths;
	String interestRate;

	public Sale(String code, String proType, String dateTime, Address address, String totalCost, String downPayment,
			String monthlyPayment, String payableMonths, String interestRate) {
		super();
		this.code = code;
		this.proType = proType;
		this.dateTime = dateTime;
		this.address = address;
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.monthlyPayment = monthlyPayment;
		this.payableMonths = payableMonths;
		this.interestRate = interestRate;
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

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(String downPayment) {
		this.downPayment = downPayment;
	}

	public String getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(String monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public String getPayableMonths() {
		return payableMonths;
	}

	public void setPayableMonths(String payableMonths) {
		this.payableMonths = payableMonths;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}


	@Override
	public double GetTax(double subtotal) {
		return subtotal*0.06;
	}



	@Override
	public double ComputeGrandTotal(double tax, double subtotal) {
			return subtotal+tax;
			}

	@Override
	public double ComputeSubTotal(String n, String type) {
		String[] n2 = n.split(",");
		
		double numUnit = Double.parseDouble(n2[0]);
		double monthlyPayment = Double.parseDouble(n2[1]);
		double totalCost = Double.parseDouble(n2[2]);
		double downPayment = Double.parseDouble(n2[3]);
		double monthsPaidSoFar = Double.parseDouble(n2[4]);
		double interestRate = (Double.parseDouble(n2[5]))/100;
		double subtotal = 0.0;
		double s1 = monthsPaidSoFar * monthlyPayment;
		double s2 = totalCost - downPayment - s1;
		double s3 = s2* interestRate;
		double s4 = monthlyPayment+ s3;
		subtotal= numUnit*s4;
		
		return subtotal;
	}

	}