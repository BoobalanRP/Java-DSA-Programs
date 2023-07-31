package day24_abstraction;

import java.util.Scanner;

abstract class Bank {
	abstract int getBalance();
}

class IndianBank extends Bank {
	private int balance;

	public IndianBank(int amount) {
		this.balance = amount;
	}

	@Override
	int getBalance() {
		return balance;
	}
}

class RepcoBank extends Bank {
	private int balance;

	public RepcoBank(int amount) {
		this.balance = amount;
	}

	@Override
	int getBalance() {
		return balance;
	}
}

class HDFCBank extends Bank {
	private int balance;

	public HDFCBank(int amount) {
		this.balance = amount;
	}

	@Override
	int getBalance() {
		return balance;
	}
}

public class BankGetBalance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int amount1 = scanner.nextInt();
		int amount2 = scanner.nextInt();
		int amount3 = scanner.nextInt();

		IndianBank indianBank = new IndianBank(amount1);
		RepcoBank repcoBank = new RepcoBank(amount2);
		HDFCBank hdfcBank = new HDFCBank(amount3);

		System.out.println("Amount Deposited in IndianBank : " + indianBank.getBalance());
		System.out.println("Amount Deposited in RepcoBank : " + repcoBank.getBalance());
		System.out.println("Amount Deposited in HDFC Bank : " + hdfcBank.getBalance());
	}
}

//Input (stdin)
//15500
//17000
//92800
//
//Output (stdout)
//Amount Deposited in IndianBank : 15500
//Amount Deposited in RepcoBank : 17000
//Amount Deposited in HDFC Bank : 92800
