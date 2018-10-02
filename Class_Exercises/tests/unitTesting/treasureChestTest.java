package unitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class treasureChestTest {
	private TreasureChest chest7;

	@BeforeEach
	void setUp() throws Exception {
		chest7 = new TreasureChest(7);

	}

	@Test
	void testTreasureChest() {
		TreasureChest chest5 = new TreasureChest(5);
		assertEquals(5, chest5.getGold()); // pass expected and actual values
	}

	@Test
	void testGetGold() {
		int expected = 7;
		int actual = chest7.getGold(); // to test getGold we call getGold
		assertEquals(expected, actual);
	}

	@Test
	void testAdd() {
		chest7.add(2); // To test add, we call add
		assertEquals(9, chest7.getGold()); // expected, actual
	}

	@Test
	void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		TreasureChest chest3 = new TreasureChest(3);
		assertEquals("[3]", chest3.toString()); // pass expected and actual values for String
	}

}
