package day05;

import java.util.Arrays;
import java.util.Scanner;

public class OnlineShoppingFlipkartOrAmazonOrSnapdeals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int flip1 = sc.nextInt();
		int flip2 = sc.nextInt();
		int flip3 = sc.nextInt();
		int snap1 = sc.nextInt();
		int snap2 = sc.nextInt();
		int snap3 = sc.nextInt();
		int amaz1 = sc.nextInt();
		int amaz2 = sc.nextInt();
		int amaz3 = sc.nextInt();
		float discount1 = (flip2 / 100.0f) * flip1;
		float discount2 = (snap2 / 100.0f) * snap1;
		float discount3 = (amaz2 / 100.0f) * amaz1;

		int flipkart = Math.round(flip1 - discount1) + flip3;
		int snapdeal = Math.round(snap1 - discount2) + snap3;
		int amazon = Math.round(amaz1 - discount3) + amaz3;

		int[] array = new int[3];
		array[0] = flipkart;
		array[1] = snapdeal;
		array[2] = amazon;

		int minimum = Arrays.stream(array).min().getAsInt();
		// getAsInt() is to provide a way to handle potentially null values more
		// effectively, avoiding null pointer exceptions.
		System.out.println("In Flipkart: Rs." + flipkart);
		System.out.println("In Snapdeal: Rs." + snapdeal);
		System.out.println("In Amazon: Rs." + amazon);

		if (minimum == flipkart) {
			System.out.println("He will prefer Flipkart");
		} else if (minimum == amazon) {
			System.out.println("He will prefer Amazon");
		} else if (minimum == snapdeal) {
			System.out.println("He will prefer Sanpdeal");
		}

	}

}