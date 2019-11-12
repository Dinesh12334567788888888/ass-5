package entities;

public abstract class Product {

	public abstract double GetTax(double subtotal);
	public abstract double ComputeGrandTotal(double tax, double subtotal);
	public abstract String getProType();
	public abstract double ComputeSubTotal(String n, String type);
	public abstract String getCode();

	
}
