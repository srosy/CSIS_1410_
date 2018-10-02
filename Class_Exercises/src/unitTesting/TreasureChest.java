package unitTesting;

/**
 * 
 * Represents a treasure chest that stores a given amount of gold coins.
 * 
 * @author SpencerR
 *
 */
public class TreasureChest {
	private int gold; // amount of gold coins

	/**
	 * Initialized treasure test with specified amount of gold.
	 * 
	 * @param gold
	 */
	public TreasureChest(int gold) {
		this.gold = gold;
	}

	/**
	 * Returns the amount of gold coins in the treasure chest.
	 * 
	 * @return
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * Adds the specified amount of gold coins to the treasure chest.
	 * 
	 * @param gold
	 */
	public void add(int gold) {
		this.gold += gold; // add new gold coins to existing gold coins
	}

	/**
	 * Removes the amount of gold coins specified and returns true if the treasure
	 * chest included enough gold. If the amount of gold coins specified is greater
	 * than the amount of gold in the treasure chest no gold is removed and the
	 * method returns false.
	 * 
	 * @param gold
	 * @return
	 */
	public boolean remove(int gold) {
		return false; // TODO
	}

	/**
	 * Returns a string of the following format [{number of gold coins}].
	 */
	@Override
	public String toString() {
		return "[" + gold + "]";
	}

}
