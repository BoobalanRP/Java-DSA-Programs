package day25_interface;

import java.util.Scanner;

interface Maintainancecharge {
	int compute();
}

class Account {

	String name;
	int number;
	int balance;
	String Startdate;
}

class Currentaccount extends Account {
	int r;

	int compute(int n) {
		r = 100 * n + 200;
		return r;
	}
}

class Savingsaccount extends Account {
	int g;

	int compute(int n) {
		g = (2 * 50 * n) + 50;
		return g;
	}
}

class Main {
	public static void main(String args[]) {
		int n;
		String na;
		int an;
		int ab;
		String sd;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Current Account");
		System.out.println("2.Savings Account");
		n = sc.nextInt();
		System.out.println("Name");
		na = sc.nextLine();
		na = sc.nextLine();
		System.out.println("Account Number");
		an = sc.nextInt();
		System.out.println("Account Balance");
		ab = sc.nextInt();
		System.out.println("Enter the Start Date(yyyy-mm-dd)");
		sd = sc.nextLine();
		sd = sc.nextLine();
		System.out.println("Enter the Years");
		y = sc.nextInt();
		if (n == 1) {
			Currentaccount obj1 = new Currentaccount();
			System.out.println("Maintainence Charge For Current Account " + obj1.compute(y) + ".00");
		} else {
			Savingsaccount obj2 = new Savingsaccount();
			System.out.println("Maintainence Charge For savings Account " + obj2.compute(y) + ".00");
		}
	}

}
