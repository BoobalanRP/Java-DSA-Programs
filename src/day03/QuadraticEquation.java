package day03;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		double discriminant = b * b - 4 * a * c;

		if (discriminant < 0) {
			System.out.println("imaginary");
		} else {

			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

			System.out.printf("%.2f\n", root1);
			System.out.printf("%.2f\n", root2);
		}
	}

}
