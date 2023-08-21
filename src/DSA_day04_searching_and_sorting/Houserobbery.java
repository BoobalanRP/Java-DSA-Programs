package DSA_day04_searching_and_sorting;

import java.util.Scanner;

public class Houserobbery {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of thieves and houses
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Read the attacking power of each thief
		int[] attackingPower = new int[m];
		for (int i = 0; i < m; i++) {
			attackingPower[i] = scanner.nextInt();
		}

		// Initialize an array to store the money each thief can get
		int[] moneyForThief = new int[m];

		// Read the defensive power and money for each house
		for (int i = 0; i < n; i++) {
			int defensivePower = scanner.nextInt();
			int houseMoney = scanner.nextInt();

			// Check each thief's attacking power against the house's defensive power
			for (int j = 0; j < m; j++) {
				if (attackingPower[j] >= defensivePower) {
					// Thief can attack this house and accumulate money
					moneyForThief[j] += houseMoney;
				}
			}
		}
		// Print the money each thief can get
		for (int i = 0; i < m; i++) {
			System.out.print(moneyForThief[i] + " ");
		}

		scanner.close();
	}
}

//Input (stdin)
//5 4
//1 3 5 2 4
//0 1
//4 2
//2 8
//9 4
//
//Output (stdout)
//1 9 11 9 11