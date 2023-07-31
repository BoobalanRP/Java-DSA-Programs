package day22_Constructor;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.print("Enter the value of N: ");
		int N = scanner.nextInt();

		// System.out.print("Enter the number of multiples (P): ");
		int P = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= P; i++) {
			int multiple = N * i;
			sum += multiple;
		}

		int average = sum / P;
		System.out.println(average);
	}
}

//Input (stdin)
//5
//3
//
//Output (stdout)
//10