package shoppingCart;

public class Item {
private String name;
private int price;
private int quantity;	

		public Item(String name, int quantity, int price) {
	this.name = name;
	this.quantity =quantity;
	this.price = price;
}

		public String getItemNames() {
			return name;
	
		}

		public int getPrice() {
			// TODO Auto-generated method stub
			return price;
		}
		
		public int getQuantity() {
			// TODO Auto-generated method stub
			return quantity;
}}

