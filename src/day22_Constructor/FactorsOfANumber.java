package day22_Constructor;

import java.util.Scanner;

public class FactorsOfANumber {
	int num;

	public FactorsOfANumber(int num) {
		this.num = num;
	}

	public void printNumbers() {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		FactorsOfANumber result = new FactorsOfANumber(num);
		result.printNumbers();
	}

}

//Input (stdin)
//10
//
//Output (stdout)
//1
//2
