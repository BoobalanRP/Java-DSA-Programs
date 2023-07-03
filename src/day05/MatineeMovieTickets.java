package day05;

import java.util.Scanner;

public class MatineeMovieTickets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		float time = sc.nextFloat();
		boolean timings = time == 10.15 || time == 13.30 || time == 18.00 || time == 22.00;

		if (age > 13 && timings) {
			System.out.println("$8.00"); // Adult matinee price
		} else if (age > 13 && !timings && age < 60) {
			System.out.println("$5.00"); // Normal adult price
		} else if (age >= 6 && age <= 12 && timings) {
			System.out.println("$2.00"); // Children's matinee price
		} else if (age >= 6 && age <= 12) {
			System.out.println("$4.00"); // Normal children's price
		} else {
			System.out.println("$8.00");
		}

	}

}
