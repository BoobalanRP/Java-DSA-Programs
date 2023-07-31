package day23_Inhertence;

import java.util.Scanner;

public class BankAccount {
	private String depositorName;
	private int accountNumber;
	private String accountType;
	private double balance;

	public BankAccount(String name, int accNumber, String accType, double initBalance) {
		depositorName = name;
		accountNumber = accNumber;
		accountType = accType;
		balance = initBalance;
	}

	// Method to deposit an amount
	public void deposit(double amount) {
		balance += amount;
	}

	// Method to withdraw an amount after checking the balance
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	// Method to display name and balance
	public void display() {
		System.out.println("Account No: " + accountNumber);
		System.out.println("Name: " + depositorName);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + (int) balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Details:");
		int accNo = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String accType = sc.nextLine();
		double balance = sc.nextDouble();

		BankAccount account = new BankAccount(name, accNo, accType, balance);
		System.out.println("Account No:");
		System.out.println("Name:");
		System.out.println("Account Type:");
		System.out.println("Balance:");
		System.out.println("Enter Deposit Amount = ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);

		System.out.println("Enter Withdraw Amount = ");
		double withdrawAmount = sc.nextDouble();
		account.withdraw(withdrawAmount);

		account.display();
	}
}

//Input (stdin)
//1234
//Raj
//Saving
//50000
//14000
//49000
//
//Output (stdout)
//Enter Details:
//Account No:
//Name:
//Account Type:
//Balance:
//Enter Deposit Amount =
//Enter Withdraw Amount =
//Account No: 1234
//Name: Raj
//Account Type: Saving
//Balance: 15000
