package entities;

public abstract class Customer {
	
	public abstract double GetTax(int tax);
	public abstract double GetDiscount(int price);
	public abstract double GetAdditionalFees();
	public abstract String getName();
	public abstract String getCusCode();
	public abstract String getType();

	
}