package day05;

import java.util.Scanner;

public class FindBudget {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int blastRifles = sc.nextInt();
		int visualSensors = sc.nextInt();
		int auditorySensors = sc.nextInt();
		int arms = sc.nextInt();
		int legs = sc.nextInt();

		double tA = (blastRifles * 350.34) + (visualSensors * 230.90) + (auditorySensors * 190.55) + (arms * 125.30)
				+ (legs * 180.90);

		if (tA <= 15000) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
