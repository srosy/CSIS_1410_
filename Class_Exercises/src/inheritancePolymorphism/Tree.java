package inheritancePolymorphism;

/**
 * Represents a tree with a given height and age.
 * 
 * @author SpencerR
 *
 */
public class Tree {
	private double height; // in feet
	private int age;

	/**
	 * Initializes the tree with the age and height provided by the user.
	 * 
	 * @param height
	 * @param age
	 */
	public Tree(double height, int age) {
		this.height = height;
		this.age = age;
	}

	/**
	 * Grows the tree by half a foot.
	 */
	public void grow() {
		height += .5; // in feet
		System.out.println("growing . . .");
	}

	/**
	 * Scatters the seeds of the tree.
	 */
	public void scatterSeeds() {
		System.out.println("scattering seeds . . .");
	}

	/**
	 * Returns the age and height of the tree in the following Format: Tree
	 * [age={age} height={height}]
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + age + " years, " + height + "' ";
	}

}
