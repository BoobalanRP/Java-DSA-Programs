package day04;

import java.util.Scanner;

public class RoadonWhichtheCar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int roadA = scanner.nextInt();
		int roadB = scanner.nextInt();
		int roadC = scanner.nextInt();
		int numOfCars = scanner.nextInt();

		if (roadA % numOfCars == 0) {
			System.out.println("Car 1 goes into road A");
		} else if (roadB % numOfCars == 0) {
			System.out.println("Car 1 goes into road B");
		} else if (roadC % numOfCars == 0) {
			System.out.println("Car 1 goes into road C");
		} else {
			System.out.println("No path exists");
		}

	}

}
