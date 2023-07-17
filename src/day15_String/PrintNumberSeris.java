package day15_String;

import java.util.Scanner;

public class PrintNumberSeris {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int a = 3, b = 8, c = 0, d = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < loop; i++) {
			c = (a + b) + i;
			a = b;
			b = c;

			System.out.print(c + " ");
		}

	}

}
// 3 8 13 24 41 output