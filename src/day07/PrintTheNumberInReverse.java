package day07;

import java.util.Scanner;

public class PrintTheNumberInReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		while (a >= b) {
			System.out.println(a);
			a--;
		}

	}

}
