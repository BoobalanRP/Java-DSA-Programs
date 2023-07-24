package day20_Exception;

import java.util.Scanner;

public class TravellingExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		double value = (double) (200) / (m + n);
		System.out.println(value);
	}

}

//Input (stdin)
//25 60
//
//
//Output (stdout)
//2.3529411764705883