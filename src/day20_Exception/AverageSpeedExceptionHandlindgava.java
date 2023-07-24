package day20_Exception;

import java.util.Scanner;

public class AverageSpeedExceptionHandlindgava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		double value = (double) (2 * m * n) / (m + n);
		System.out.println(value);

	}

}

//Input (stdin)
//15 65
//
//Output (stdout)
//24.375