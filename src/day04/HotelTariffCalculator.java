package day04;
//Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December].  Note: Use the switch construct.
//Input format:
//
//The first input containing an integer which denotes the number of the month
//
//The second input containing the floating point number which denotes the room rent per day
//
//The third input containing an integer which denotes the number of days stayed in the hotel

import java.util.Scanner;

public class HotelTariffCalculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		float roomRent = sc.nextFloat();
		int days = sc.nextInt();
		float totalAmount;

		if (month > 12) {
			System.out.println("Invalid Input");
		} else if (month == 4 || month == 6 || month == 11 || month == 12) {
			totalAmount = roomRent * days;
			float totalWithTax = totalAmount + (0.2f * totalAmount);
			System.out.println(totalWithTax);
		} else {
			totalAmount = roomRent * days;
			System.out.println(totalAmount);
		}
	}
}
