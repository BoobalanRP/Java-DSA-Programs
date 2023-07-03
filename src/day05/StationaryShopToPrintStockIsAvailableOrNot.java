package day05;

//	Raj starts a new stationer shop. He wants to calculate the number of items that are sold and the number of items that are
//	remaining in the stock. Whenever a customer asks for them, he will be able to quickly check whether the item is already sold or available. 
//	If the item is not available, it should display "Out of stock". If it is available, it should display the remaining number of items 
//	available and the total cost that should be paid by a customer. If the number of items asked by the customer is greater than the items available,
//	it should display the number of items currently available. For example, if a customer asks 8 scales and only 3 scales are available, 
//	display "Only 3 scale are available". INPUT & OUTPUT FORMAT: Input consists of 1 string and 3 integers.
//	First input corresponds to the item name. Second input corresponds to the number of items available in the stock.
//	Third input corresponds to the amount of one item. Fourth input corresponds to the number of items asked by the customer.
//		SAMPLE INPUT:
//	
//	pencil
//	
//	10
//	
//	15
//	
//	5
//	
//	
//	
//	SAMPLE OUTPUT:
//	
//	The amount for 5 pencil is 75
//	
//	Remaining number of pencils present in the stock: 5
import java.util.Scanner;

public class StationaryShopToPrintStockIsAvailableOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String productName = sc.nextLine();
		int stock = sc.nextInt();
		int price = sc.nextInt();
		int customerAsk = sc.nextInt();

		int amount = customerAsk * price;
		int currentStock = stock - customerAsk;
		if (stock <= 0) {
			System.out.println("Out of stock");
		} else if (customerAsk > stock) {
			System.out.println("Only " + stock + " " + productName + " are available");
		} else {
			System.out.println("The amount for" + customerAsk + " pencil is " + amount);
			System.out.println("Remaining number of pencils present in the stock: " + currentStock);
		}

	}

}
