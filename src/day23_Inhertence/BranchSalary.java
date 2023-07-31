package day23_Inhertence;

import java.util.Scanner;

class Faculty {
	private double baseSalary;

	public Faculty(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
}

class CSE extends Faculty {
	public CSE(double baseSalary) {
		super(baseSalary);
	}

	public double getSalary() {
		return getBaseSalary() + 3000;
	}
}

class IT extends Faculty {
	public IT(double baseSalary) {
		super(baseSalary);
	}

	public double getSalary() {
		return getBaseSalary() + 5000;
	}
}

class ECE extends Faculty {
	public ECE(double baseSalary) {
		super(baseSalary);
	}

	public double getSalary() {
		return getBaseSalary() + 4500;
	}
}

public class BranchSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double baseSalary = sc.nextDouble();

		if (baseSalary <= 0) {
			System.out.println("None");
		} else {
			Faculty faculty = new Faculty(baseSalary);
			CSE cse = new CSE(baseSalary);
			IT it = new IT(baseSalary);
			ECE ece = new ECE(baseSalary);

			System.out.println("Base Salary: " + (int) faculty.getBaseSalary());
			System.out.println("CSE Faculty : " + (int) cse.getSalary());
			System.out.println("IT Faculty : " + (int) it.getSalary());
			System.out.println("ECE Faculty : " + (int) ece.getSalary());
		}
	}
}

//Input (stdin)
//500000
//
//Output (stdout)
//Base Salary: 500000
//CSE Faculty : 503000
//IT Faculty : 505000
//ECE Faculty : 504500
