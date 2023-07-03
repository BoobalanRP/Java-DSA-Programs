package day07;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mul = 0;
		System.out.println("The multiplication table of " + a + " is");
		for (int i = 1; i <= b; i++) {
			mul = i * a;

			System.out.println(i + "*" + a + "=" + mul);
		}

	}

}
