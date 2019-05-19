package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ItemOrder {

	List<Item> items = new ArrayList<>();

	public void addItem(Item itemToAdd) {
		// TODO Auto-generated method stub
		items.add(itemToAdd);
	}

	public int getTotalQuantity() {
		int quantity = 0;
		for (Item order : items) {
			quantity += order.getQuantity();
		}
		return quantity;
	}

	public int getTotalPrice() {
		int price = 0;
		for (Item order : items) {
			price += order.getQuantity() * order.getPrice();
		}
		return price;
	}

	
	public void removeVariety(String nameToRemove) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getItemNames().equals(nameToRemove)) {
				items.remove(i);
				break;
		
	}}}
	
public void showItems() {
	for (Item order : items) {
		System.out.println("Name: " + order.getItemNames() + ", Quantity " + order.getQuantity() + ", Price " + order.getPrice());
	}
}}