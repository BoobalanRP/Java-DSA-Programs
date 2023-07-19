package day17_Recursion;

import java.util.Scanner;

class PowerMain {
	public static int PowerTheGivenNumbers(int a, int b) {
		if (b > 0) {
			return a * PowerTheGivenNumbers(a, b - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		int total = PowerTheGivenNumbers(num, pow);

		System.out.print("The value of " + num + " power " + pow + " is " + total);
	}
}

//Input (stdin)
//2
//8
//
//Output (stdout)
//The value of 2 power 8 is 256