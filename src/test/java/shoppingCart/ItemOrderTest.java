package shoppingCart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemOrderTest {

	@Test
	public void shouldReturnItemName() {
		Item underTest = new Item("Milk", 5, 0);
		String ItemName = underTest.getItemNames();
		assertEquals("Milk", ItemName);
	}

	@Test
	public void shouldReturnItemPrice() {
		Item underTest = new Item("Milk", 5, 0);
		int price = underTest.getPrice();
		assertEquals(0, price);
	}

	@Test
	public void shouldReturnQuantity() {
		Item underTest = new Item("Milk", 5, 0);
		int quantity = underTest.getQuantity();
		assertEquals(5, quantity);
	}

	@Test
	public void ShouldReturnTotalQuantityAsThree() {
		ItemOrder underTest = new ItemOrder();
		Item tagalongs = new Item("Tagalongs", 2, 3);
		Item samoas = new Item("Samoas", 1, 4);
		underTest.addItem(tagalongs);
		underTest.addItem(samoas);
		int quantity = underTest.getTotalQuantity();
		assertEquals(3, quantity);
	}

	@Test
	public void ShouldReturnTotalPriceAsTen() {
		ItemOrder underTest = new ItemOrder();
		Item tagalongs = new Item("Tagalongs", 2, 3);
		Item samoas = new Item("Samoas", 1, 4);
		underTest.addItem(tagalongs);
		underTest.addItem(samoas);
		int price = underTest.getTotalPrice();
		assertEquals(10, price);
	}

	@Test
	public void ShouldReturnTotalPriceAsSix() {
		ItemOrder underTest = new ItemOrder();
		underTest.addItem(new Item("tagalongs", 1, 3));
		underTest.addItem(new Item("tagalongs", 1, 3));
		underTest.addItem(new Item("Samoas", 1, 4));
		underTest.removeVariety("Samoas");
		int price = underTest.getTotalPrice();
		assertEquals(6, price);
	}
}
