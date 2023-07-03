package day03;

import java.util.Scanner;

public class EquidistantFrom3Points {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		float x = (float) ((x1 + x2 + x3) / 3.0);
		float y = (float) ((y1 + y2 + y3) / 3.0);

		System.out.printf("%.1f\n", x);
		System.out.printf("%.1f", y);
	}

}
