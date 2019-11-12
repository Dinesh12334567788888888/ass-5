package entities;

public abstract class Agreement extends Product {

	public abstract double GetTax(double subtotal);
	public abstract double ComputeGrandTotal(double tax, double subtotal);
	public abstract double ComputeSubTotal(String n, String type);


}
