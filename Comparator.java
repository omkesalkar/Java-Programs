class Customer 
{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;

	public Customer(Integer customerNumber, String customerName, Double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

}

//Main class
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTester
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
		
		listOfCustomers.add(new Customer(101, "Laptop", 75000.0));
		listOfCustomers.add(new Customer(103, "Tablet", 30000.0));
		listOfCustomers.add(new Customer(102, "Smartphone", 25000.0));
		listOfCustomers.add(new Customer(104, "Monitor", 15000.0));

		System.out.println("Before Sorting: ");
		listOfCustomers.forEach(System.out::println);
		
		// Sorting by customer number using lambda in ascending order
		listOfCustomers.sort((o1, o2) -> o1.getCustomerNumber().compareTo(o2.getCustomerNumber()));
		System.out.println("\nAfter sorting based on customer number: ");
		listOfCustomers.forEach(System.out::println);
		
		// Sorting by customer name using lambda in ascending order
		listOfCustomers.sort((o1, o2) -> o1.getCustomerName().compareTo(o2.getCustomerName()));
		System.out.println("\nAfter sorting based on customer name: ");
		listOfCustomers.forEach(System.out::println);
				
		// Sorting by customer bill using lambda in ascending order
		listOfCustomers.sort((o1, o2) -> o1.getCustomerBill().compareTo(o2.getCustomerBill()));
		System.out.println("\nAfter sorting based on customer bill: ");
		listOfCustomers.forEach(System.out::println);
	}

}

