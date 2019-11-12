package driver;

import java.util.ArrayList;
import java.util.List;
import entities.Address;
import entities.Amenity;
import entities.Customer;
import entities.Invoice;
import entities.Person;
import entities.Product;
import entities.Sale;
import reader.FlatFileReader;

public class InvoiceReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a FlatFileReader object
		FlatFileReader fr = new FlatFileReader();
		ArrayList<Customer> customerList = fr.readCustomer();
		ArrayList<Person> personList = fr.readPersons();
		ArrayList<Product> productList = fr.readProduct();
		ArrayList<Invoice> invoiceList = fr.readInvoice();
		
		 System.out.println("+++");
		 System.out.println("Executive Summary Report");
		  System.out.println("========================\n");
		  System.out.printf("%s %5s %15s %15s %8s %8s %8s %8s\n", "Invoice",
		 "Customer", "Realtor","Subtotal","Fees","Taxes", "Discount","Total");
		 

		double totalSale = 0;
		double totalTax = 0;
		double totalfees = 0;
		double totalDiscount = 0;

		for (Invoice i : invoiceList) {

			totalSale = 0;
			for (int j = 0; j < i.getProductList().size(); j++) {
				String[] products = i.getProductList().get(j).split(":");
				String pcode = products[0];

				int nUnits = Integer.parseInt(products[1]);
				String portype = getProductType(productList, pcode);
				String custype = getCustomerType(customerList,i.getCusCode());
				if (portype.equals("S")) {
					String result = subTotalSaleService(productList, pcode, nUnits, i.getDate());
					int index = getProductIndex(productList, pcode);
					totalSale += productList.get(index).ComputeSubTotal(result,custype);	
				}
				if (portype.equals("A")) {
					String result = subTotalAmenities(productList,pcode,nUnits);
					int index = getProductIndex(productList, pcode);
					totalSale+=productList.get(index).ComputeSubTotal(result,custype);
					 System.out.println(totalSale);

				}
			}

			
			  System.out.printf("%s %15s %s %15s\n ",i.getiNumber(),
			  getCustomerName(customerList, i.getCusCode()), getCustomerType(customerList,
			  i.getCusCode()), getPersonName(personList, i.getRealCode()) );
			 

		}
	}

	public static String getCustomerName(ArrayList<Customer> customerList, String id) {
		String result = null;
		for (Customer c : customerList) {
			if (c.getCusCode().equals(id)) {
				result = c.getName();
			}
		}
		return result;
	}

	public static String getCustomerType(ArrayList<Customer> customerList, String id) {
		String result = null;
		for (Customer c : customerList) {
			if (c.getCusCode().equals(id)) {
				result = c.getType();
			}
		}
		if (result.equals("G")) {
			result = "General";
		} else {
			result = "LowIncome";
		}
		return result;
	}

	public static String getPersonName(ArrayList<Person> personList, String id) {
		String result = null;
		for (Person c : personList) {
			if (c.getPerCode().equals(id)) {
				result = c.getName().getFirstname() + "," + c.getName().getLastname();
			}
		}
		return result;
	}

	public static String subTotalSaleService(ArrayList<Product> productList, String id, int nUnits, String date) {
		String result = null;

		for (Product c : productList) {

			if (c.getCode().equals(id)) {
				result = nUnits + "," 	
						+ ((Sale) c).getMonthlyPayment() + "," 
						+ ((Sale) c).getTotalCost() + ","
						+ ((Sale) c).getDownPayment() + "," 
						+ subtractDates(((Sale) c).getDateTime(), date) + ","
						+ ((Sale) c).getInterestRate();
			}
		}
		return result;

	}

	public static String subTotalAmenities(ArrayList<Product> productList, String id, int nUnits) {
		String result = null;

		for (Product c : productList) {

			if (c.getCode().equals(id)) {
				result = nUnits + "," + ((Amenity) c).getCost();
			}
		}
		return result;

	}

	public static int subtractDates(String moveinDate, String invoiceDate) {
		String[] iD = invoiceDate.split("-");
		String[] mD = moveinDate.split("-");
		int idy = Integer.parseInt(iD[0]);
		int idm = Integer.parseInt(iD[1]);
		int mdy = Integer.parseInt(mD[0]);
		int mdm = Integer.parseInt(mD[1]);
		return (idm - mdm) + ((idy - mdy) * 12);

	}

	public static String getProductType(ArrayList<Product> productList, String id) {
		String result = null;
		for (Product c : productList) {
			if (c.getCode().equals(id)) {
				result = c.getProType();
			}
		}
		return result;

	}

	public static int getProductIndex(ArrayList<Product> productList, String id) {
		int result = 0;
		for (Product c : productList) {
			result++;
			if (c.getCode().equals(id)) {
				result--;
				break;
			}
		}
		return result;
	}

}