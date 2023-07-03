package day04;

import java.util.Scanner;

public class BoatWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boatwg = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = (a * 75) + (b * 30);
		if (boatwg >= total) {
			System.out.println("Boat is stable");
		} else {
			System.out.println("Boat will sink");
		}

	}

}
