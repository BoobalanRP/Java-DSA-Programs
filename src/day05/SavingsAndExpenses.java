package day05;

import java.util.Scanner;

public class SavingsAndExpenses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int totalSpent = b + c + d + e;
		if (a >= totalSpent) {
			System.out.println("He can save the money");
		} else {
			System.out.println("He has to work hard");
		}

	}

}
