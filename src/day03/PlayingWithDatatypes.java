package day03;

import java.util.Scanner;

public class PlayingWithDatatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String d = sc.nextLine();
		int a = sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		long lo = sc.nextLong();

		double du = b / c;
		int ca = (int) (c / a);
		int cai = ca + (int) lo;

		System.out.println(String.format("%.1f", du) + " " + ca + " " + cai);
		System.out.println(d + " " + d.charAt(3));

	}

}
