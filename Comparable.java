public class Product implements Comparable<Product>
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
