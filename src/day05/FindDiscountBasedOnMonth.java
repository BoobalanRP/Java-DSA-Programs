package day05;

import java.util.Scanner;

public class FindDiscountBasedOnMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int month = sc.nextInt();

		float total = 0.0f;

		switch (month) {
		case 1:
			total = amount - ((20.0f / 100) * amount);
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		case 3:
		case 4:
			total = amount - ((10.0f / 100) * amount);
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		case 6:
		case 7:
			total = amount - ((75.0f / 100) * amount);
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		case 2:
		case 5:
		case 8:
		case 9:
			total = amount;
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		case 10:
		case 11:
			total = amount - ((30.0f / 100) * amount);
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		case 12:
			total = amount - ((35.0f / 100) * amount);
			System.out.printf("Chris father needs to pay Rs.%.2f.", total);
			break;
		default:
			System.out.println("Invalid Month");
		}

	}

}
