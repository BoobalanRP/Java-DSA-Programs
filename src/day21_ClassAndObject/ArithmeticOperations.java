package day21_ClassAndObject;

import java.util.Scanner;

public class ArithmeticOperations {

	public int addtion(int a, int b) {
		return a + b;
	}

	public int suntraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int a4 = sc.nextInt();
		int b4 = sc.nextInt();

		ArithmeticOperations result = new ArithmeticOperations();

		System.out.println(result.addtion(a1, b1));
		System.out.println(result.suntraction(a2, b2));
		System.out.println(result.multiplication(a3, b3));
		System.out.println(result.division(a4, b4));

	}

}

//
//Input (stdin)
//5
//2
//6
//3
//9
//6
//5
//3
//
//Output (stdout)
//7
//3
//54
//1