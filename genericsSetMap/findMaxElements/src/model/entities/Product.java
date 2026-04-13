package model.entities;

public class Product implements Comparable<Product> {
	
	private String productName;
	private Double productPrice;
	
	public Product() {
		
	}
	
	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return productName + ", " + String.format("%.2f", productPrice);
	}

	@Override
	public int compareTo(Product other) {
		return productPrice.compareTo(other.getProductPrice());
	}

}
