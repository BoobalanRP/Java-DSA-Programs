package day03;

import java.util.Scanner;

public class FindProfit_TotalAmount_SimpleInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int p = scanner.nextInt();
		int n = scanner.nextInt();
		int r = scanner.nextInt();

		float si = (p * n * r) / 100;
		float ta = si + p;
		float discount = si * 0.02f;
		float finalAmount = ta - discount;

		System.out.printf("%.2f\n", si);
		System.out.printf("%.2f\n", ta);
		System.out.printf("%.2f\n", discount);
		System.out.printf("%.2f", finalAmount);

	}

}
