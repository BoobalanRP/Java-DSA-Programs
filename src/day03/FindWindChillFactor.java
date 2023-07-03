package day03;

import java.util.Scanner;

public class FindWindChillFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int v = sc.nextInt();

		double WCF = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
		System.out.printf("%.2f", WCF);

	}

}
