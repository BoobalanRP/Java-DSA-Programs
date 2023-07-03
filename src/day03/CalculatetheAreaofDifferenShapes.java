package day03;

import java.util.Scanner;

public class CalculatetheAreaofDifferenShapes {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int side = n.nextInt();
		int len = n.nextInt();
		int bre = n.nextInt();
		float rad = n.nextFloat();

		int area = side * side;
		int rectangle = len * bre;
		float circle = (float) (3.14 * rad * rad);

		System.out.println(area);
		System.out.println(rectangle);
		System.out.printf("%.2f", circle);

	}

}
