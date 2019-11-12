package entities;

public  class ParkingPass extends Service {
	String code;
	String proType;
	String parkingfee;

	

	public ParkingPass(String code, String proType, String parkingfee) {
	
		this.code = code;
		this.proType = proType;
		this.parkingfee = parkingfee;
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

	public String getParkingfee() {
		return parkingfee;
	}

	public void setParkingfee(String parkingfee) {
		this.parkingfee = parkingfee;
	}


	@Override
	public double GetTax(double subtotal) {
		
		return subtotal*0.04;
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