package day08;

import java.util.Scanner;

public class PrintTheNumberDivideByTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double value = 2;
		for(int i=1; i<=num; i++) {
			value /=2;
		System.out.print(value + " ");
		}

	}

}
