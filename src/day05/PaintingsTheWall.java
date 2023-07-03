package day05;

import java.util.Scanner;

public class PaintingsTheWall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int p1 = sc.nextInt();
		int pc1 = sc.nextInt();
		int p2 = sc.nextInt();
		int pc2 = sc.nextInt();
		int mul = l * b;
		int paint1 = p1 + pc1;
		int paint2 = p2 + pc2;
		int total = paint1 * paint2;
		if (mul >= total) {
			System.out.println("Raj can fix both painting");
		} else {
			System.out.println("Raj cannot fix both painting");
		}

	}

}
