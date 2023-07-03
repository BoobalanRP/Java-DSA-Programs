package day04;

import java.util.Scanner;

public class Eligibilityforplacements {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String name = n.next();
		int mark = n.nextInt();
		float cgpa = n.nextFloat();
		int arrears = n.nextInt();

		System.out.println(name);
		System.out.println(mark);
		if (cgpa >= 7.0 && arrears <= 7.5 && cgpa < 7.5) {
			System.out.println("Not Eligible to attend placement");
		} else if (cgpa >= 7.5 && arrears >= 1 && arrears <= 2) {
			System.out.println("Eligible to attend placement");
		}

	}

}
