package inheritancePolymorphism;

public class TreeApp {

	public static void main(String[] args) {
		Tree tree = new Tree(10.5, 3);
		System.out.println("Tree: " + tree);
		tree.grow();
		System.out.println("Tree: " + tree);
		System.out.println();

		DeciduousTree aspen = new DeciduousTree(75, 2, "round", false);
		System.out.println("aspen: " + aspen);
		aspen.grow();
		aspen.grow();
		aspen.grow();
		aspen.shedLeaves();
		aspen.scatterSeeds();
		System.out.println("aspen: " + aspen);
		System.out.println();

		ConiferousTree fir = new ConiferousTree(10.5, 3, true);
		System.out.println("fir: " + fir);
		fir.grow();
		fir.grow();
		fir.scatterSeeds();
		System.out.println("fir: " + fir);

	}
}
