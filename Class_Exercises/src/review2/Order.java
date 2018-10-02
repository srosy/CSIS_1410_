package review2;

import java.util.ArrayList;

/**
 * Represents an order of products.
 * 
 * @author Spencer Rosenvall
 *
 */

public class Order {

	private static String name;
	private static ArrayList<Product> products;

	/**
	 * Initializes the fields In order to have the products changed after the order
	 * has been created we need to make a defensive copy.
	 * 
	 * @param name
	 * @param products
	 */

	public Order(String name, ArrayList<Product> products) {
		this.name = name;
		this.products = new ArrayList<>(products); // see comment above, defensive Arraylist copy
	}

	/**
	 * Returns the name of the order.
	 * 
	 * @return
	 */

	public String getName() { // doc comments should be done for every public class and method
		return name;
	}

	/**
	 * Returns the list of the products associated with the order.
	 * 
	 * @return
	 */

	public ArrayList<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", products=" + products + "]";
	}

	public static void main(String[] args) { // doc comment unnecessary for main method

		ArrayList<Product> products = new ArrayList<Product>(); // create ArrayList

		products.add(new Product("pie", 3.99)); // create Product objects and add to list
		products.add(new Product("cake", 7.50));
		products.add(new Product("pizza", 4.99));

		Order myOrder = new Order("myOrder", products);

		System.out.printf("%s: %s", myOrder.getName(), myOrder.getProducts());
	}
}
