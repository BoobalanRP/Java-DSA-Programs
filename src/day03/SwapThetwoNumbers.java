package day03;

import java.util.Scanner;

public class SwapThetwoNumbers {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

	}

}
