package day21_ClassAndObject;

import java.util.Scanner;

public class ElectricityBill {

	int bill;
	String name;
	int unit;
	double first;

	public ElectricityBill(int bill, String name, int unit) {
		this.bill = bill;
		this.name = name;
		this.unit = unit;
	}

	public String getname() {
		return name;
	}

	public int getbill() {
		return bill;
	}

	public int getunit() {
		return unit;
	}

	public double getEBbill() {
		if (unit <= 100) {
			first = unit * 1.20;
		} else if (unit > 100 && unit <= 300) {
			for (int i = 1; i <= unit; i++) {
				if (i <= 100) {
					first += 1.20;
				} else if (i > 100 && i <= 300) {
					first += 2;
				}
			}
		} else {
			for (int i = 1; i <= unit; i++) {
				if (i <= 100) {
					first += 1.20;
				} else if (i > 100 && i <= 300) {
					first += 2;
				} else if (i > 300) {
					first += 3;
				}
			}
		}
		return first;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int bill = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int unit = sc.nextInt();

		ElectricityBill ebBill = new ElectricityBill(bill, name, unit);
		System.out.println(ebBill.getbill());
		System.out.println(ebBill.getname());
		System.out.println(ebBill.getunit());
		System.out.println((int) ebBill.getEBbill());
	}
}

//Input (stdin)
//15
//Siva
//70
//
//Output (stdout)
//15
//Siva
//70
//84
