package day05;

import java.util.Scanner;

public class TheSeriesandFindtheNthTerm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases

		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt(); // Read the first number
			int b = scanner.nextInt(); // Read the second number
			int c = scanner.nextInt(); // Read the third number
			int n = scanner.nextInt(); // Read the value of n

			int result = findNthTerm(a, b, c, n); // Call the method to find the nth term
			System.out.println(result); // Print the result
		}

	}

	public static int findNthTerm(int a, int b, int c, int n) {

		int[] series = new int[n + 1]; // Create an array to store the series

		series[1] = a; // Assign the first number to series[1]
		series[2] = b; // Assign the second number to series[2]
		series[3] = c; // Assign the third number to series[3]

		for (int i = 4; i <= n; i++) {
			series[i] = series[i - 1] + series[i - 2] + series[i - 3]; // Calculate the nth term
		}

		return series[n]; // Return the nth term
	}
}
