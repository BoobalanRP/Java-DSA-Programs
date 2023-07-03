package day03;

import java.util.Scanner;

public class Operators {


	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		int s = n.nextInt();
		int p = n.nextInt();

		System.out.println(s * p);
		System.out.println(s / p);
		System.out.println(s % p);

	}
}