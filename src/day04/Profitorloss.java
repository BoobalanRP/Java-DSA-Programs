package day04;

import java.util.Scanner;

public class Profitorloss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float dozen = 12;
		float totalCP = sc.nextFloat(); // 60
		float sp = sc.nextFloat(); // 4
		double totalSP = dozen * sp; // 12 * 4 = 48
		if (totalSP > totalCP) {
			double profit = totalSP - totalCP;
			System.out.printf("Profit : Rs.%.2f", profit);
		} else if (totalCP > totalSP) {
			double loss = totalCP - totalSP;
			System.out.printf("Loss : Rs.%.2f", loss);
		} else {
			System.out.println("No profit nor loss");
		}
	}

}
