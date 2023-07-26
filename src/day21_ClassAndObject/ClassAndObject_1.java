package day21_ClassAndObject;

import java.util.Scanner;

public class ClassAndObject_1 {

	String name;
	String add;
	String email;
	long mobile;
	String proof;
	long proofId;

	public ClassAndObject_1(String name, String add, String email, long mobile, String proof, long proofId) {
		this.name = name;
		this.add = add;
		this.email = email;
		this.mobile = mobile;
		this.proof = proof;
		this.proofId = proofId;
	}

	public String getname() {
		return name;
	}

	public String getadd() {
		return add;
	}

	public String getproof() {
		return proof;
	}

	public String getemail() {
		return email;
	}

	public long getmobile() {
		return mobile;
	}

	public long getproofId() {
		return proofId;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your address");
		String add = sc.nextLine();

		System.out.println("Contact Number");
		long mobile = sc.nextLong();
		sc.nextLine();

		System.out.println("E-Mail ID");
		String email = sc.nextLine();

		System.out.println("Enter proof type");
		String proof = sc.nextLine();

		System.out.println("Enter proof id");
		long proofId = sc.nextLong();

		ClassAndObject_1 details = new ClassAndObject_1(name, add, email, mobile, proof, proofId);

		System.out.println("Customer Details");
		System.out.println(details.getname());
		System.out.println(details.getadd());
		System.out.println(details.getmobile());
		System.out.println(details.getemail());
		System.out.println(details.getproof());
		System.out.println(details.getproofId());
		System.out.println("Thank you for registering. Your id is 1...");

	}
}

//Input (stdin)
//Sam 
//Mumbai-34
//9876543445
//sam@gmail.com
//Aadhaar
//88886067639087
//
//Output (stdout)
//Registration
//Enter your name
//Enter your address
//Contact Number
//E-Mail ID
//Enter proof type
//Enter proof id
//Customer Details
//Sam
//Mumbai-34
//9876543445
//sam@gmail.com
//Aadhaar
//88886067639087
//Thank you for registering. Your id is 1...
