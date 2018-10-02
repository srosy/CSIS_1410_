package inheritancePolymorphism;

/**
 * Represents a decidious tree.
 * 
 * @author SpencerR
 *
 */

public class DeciduousTree extends Tree {
	/**
	 * Extends Tree, represents a deciduous tree with fruit and leafShape.
	 */
	private final String leafShape;
	private final boolean fruit; // edible fruit

	public DeciduousTree(double height, int age, String leafShape, boolean fruit) {
		super(height, age);
		this.fruit = fruit;
		this.leafShape = leafShape;
	}

	/**
	 * Returns leafShape.
	 * 
	 * @return
	 */
	public String getLeafShape() {
		return leafShape;
	}

	/**
	 * Checks if fruit tree.
	 * 
	 * @return
	 */
	public boolean isFruit() {
		return fruit;
	}

	/**
	 * Sheds leaves.
	 */
	public void shedLeaves() {
		System.out.println("shedding leaves . . .");
	}

	/**
	 * toString method, returns super.toStrings and additional toString
	 */
	@Override
	public String toString() {
		return super.toString() + " " + leafShape + " leaf shape, " + (fruit ? "edible fruits" : "no edible fruits");
	}

}
