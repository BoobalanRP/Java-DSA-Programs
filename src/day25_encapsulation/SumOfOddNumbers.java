package day25_encapsulation;

import java.util.Scanner;

class SumOfOddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}