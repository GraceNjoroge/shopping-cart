package shoppingCart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub


ItemOrder myOrder = new ItemOrder();

myOrder.addItem(new Item ("Shoes", 2, 25));
myOrder.addItem(new Item ("Shirt", 3, 15));
myOrder.addItem(new Item("Tagalongs", 5, 3));
myOrder.addItem(new Item("Samoas", 3, 4));

System.out.println("This store is selling:");
myOrder.showItems();
System.out.println("Do you want to continue?");
String answer = input.nextLine();
while (answer.equals("Yes")) {
	System.out.println("Enter the name of the item you wish to purchase");

	String name = input.nextLine();

	System.out.println("Enter the price\t\t" + " of " + name);
	int price = input.nextInt(); 

	System.out.println("Enter the number" + "of" + name);
	int quantity = input.nextInt();
	input.nextLine();
	System.out.println("You have ordered" + quantity + " of " + name + "@ " + (quantity*price));

	System.out.println("Would you like to continue shopping? (Yes or No)");
	answer = input.nextLine();
}	
	
	if (answer.equals("No")) {
	System.out.println("Proceed to Checkout");
}
}
}
