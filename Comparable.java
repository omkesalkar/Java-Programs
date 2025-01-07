class Product implements Comparable<Product>
{
	private Integer productNumber;
	private String productName;
	private Double productPrice;
	
	public Product(Integer productNumber, String productName, Double productPrice) 
	{
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	// Overriding compareTo method to sort by product name
	@Override
	public int compareTo(Product p2) {
		return this.productNumber.compareTo(p2.productNumber);
	}

	// Overriding toString method for better display
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

}

//MAIN CLASS
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableTester 
{
	public static void main(String[] args) 
	{
		ArrayList<Product> productList = new ArrayList<Product>();
		
		// Adding products to the list
		productList.add(new Product(101, "Laptop", 75000.0));
		productList.add(new Product(103, "Tablet", 30000.0));
		productList.add(new Product(102, "Smartphone", 25000.0));
        	productList.add(new Product(104, "Monitor", 15000.0));

        	// Displaying the list before sorting
		System.out.println("Before Sorting: ");
		productList.forEach(System.out::println);
		
		 // Sorting the list based on product name
		Collections.sort(productList);
		
		// Displaying the list after sorting
		System.out.println("After Sorting bases on the name: ");
		productList.forEach(System.out::println);
	}
}

