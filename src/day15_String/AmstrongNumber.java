package day15_String;

import java.util.Scanner;

//input: 153
//output: 153 Amstrong Number

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int originalN = n;
		int sum = 0;
		int count = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
			count++;
		}
		sum = 0;
		n = originalN;

		while (n > 0) {
			sum += Math.pow((n % 10), count);
			n /= 10;

		}
		n = originalN;
		if (sum == n) {
			System.out.println("Amstrong Number");

		} else {
			System.out.println("Not an Amstrong Number");
		}

	}

}
