package day21_ClassAndObject;

import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int remain = (n2 + n3) - n4;
		System.out.println("Enter Details:");
		System.out.println("Account No.");
		System.out.println("Name :");
		System.out.println("Account Type :");
		System.out.println("Balance :");
		System.out.println("Enter Deposit Amount =");
		System.out.println("Enter Withdraw Amount =");
		if (remain < 0) {
			System.out.println("Cannot Withdraw Amount");
		}
		System.out.println("Account No. : " + n1);
		System.out.println("Name : " + s1);
		System.out.println("Account Type : " + s2);
		System.out.println("Balance : " + remain);
	}

}

//
//Input (stdin)
//5346
//Jeshua
//Savings
//50000
//6000
//5000
//
//Output (stdout)
//Enter Details:
//Account No.
//Name :
//Account Type :
//Balance :
//Enter Deposit Amount =
//Enter Withdraw Amount =
//Account No. : 5346
//Name : Jeshua
//Account Type : Savings
//Balance : 51000
