package day07;

import java.util.Scanner;

public class SumOfAGivenRangeOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int total = 0;
		while (a <= b) {
			total += a;
			a++;
		}
		System.out.println(total);
	}

}
