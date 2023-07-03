package day04;

import java.util.Scanner;

public class MidPoint {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int x1 = n.nextInt();
		int y1 = n.nextInt();
		int x2 = n.nextInt();
		int y2 = n.nextInt();

		float x = (float) (x1 + x2) / 2;
		float y = (float) (y1 + y2) / 2;
		System.out.println("Binoy's house is located at (" + x + "," + y + ")");

	}

}
