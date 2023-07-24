package day20_Exception;

import java.util.Scanner;

public class DivideTwoNoExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			double result = (double) a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Infinity");
		}

	}

}

//Input (stdin)
//10 20
//
//Output (stdout)
//0.5

//Input (stdin)
//10 0
//
//Output (stdout)
//Infinity