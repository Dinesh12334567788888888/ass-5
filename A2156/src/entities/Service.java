package entities;

public abstract class Service extends Product {
	public abstract double GetTax(double subtotal);
	public abstract double ComputeGrandTotal(double tax, double subtotal);
	public abstract double ComputeSubTotal(String n, String type);



}
