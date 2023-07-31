package day24_abstraction;

import java.util.Scanner;

public class PrimeOrNotPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val = (int) Math.sqrt(num);
		boolean pri = false;
		for (int i = 2; i <= val; i++) {
			if (num % i == 0) {
				pri = true;
			}
		}
		if (pri) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}

//
//Input (stdin)
//12
//
//Output (stdout)
//Not Prime