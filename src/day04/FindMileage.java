package day04;

import java.util.Scanner;

public class FindMileage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float mileage = scanner.nextFloat();
		int petrol = scanner.nextInt();
		int distance = scanner.nextInt();

		float maxDistance = mileage * petrol;

		if (maxDistance >= distance) {
			System.out.println("Can reach");
		} else {
			System.out.println("Cannot reach");
		}

	}

}
