package review2;

/**
 * Represent a product with a specified name and an associated price.
 * 
 * @author Spencer Rosenvall
 */

public class Product {
	private String name;
	private double price;

	/**
	 * Initializes a product with the given name and price
	 * 
	 * @param name
	 * @param price
	 */

	public Product(String name, double price) { // right-click, source, pick generate constructor
		this.name = name;
		this.price = price;
	}

	/**
	 * Returns the name of the product.
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * Returns the price of the product.
	 * 
	 * @return
	 */

	public double getPrice() {
		return price;
	}

	/**
	 * Returns a String of the following format: {name}(${price})
	 */

	@Override // alt + shift + s
	public String toString() {
		return String.format("%s($%.2f)", name, price);
	}
}
