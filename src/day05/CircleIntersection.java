package day05;

import java.util.Scanner;

public class CircleIntersection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		if (distance == r1 + r2) {
			System.out.println("Tangential");
		} else if (distance < r1 + r2) {
			System.out.println("Overlap");
		} else {
			System.out.println("Do not overlap");
		}

	}

}
