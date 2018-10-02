package inheritancePolymorphism;

public class ConiferousTree extends Tree {

	private final boolean isChristmasTree;

	public ConiferousTree(double height, int age, boolean isChristmasTree) {
		super(height, age);
		this.isChristmasTree = isChristmasTree;
	}

	/**
	 * Determines whether tree is Christmas tree.
	 *
	 * @return
	 */
	public boolean isChristmasTree() {
		return isChristmasTree;
	}

	public void scatterSeeds() { // Polymorphism, overload superclass method scatterSeeds, to do something unique
									// to coniferousTree
		System.out.print("Through cones ");
		super.scatterSeeds();
	}

	@Override
	public String toString() {
		return super.toString() + (isChristmasTree ? "isChristmasTree" : "");
	}

}
