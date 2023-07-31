package day24_abstraction;

import java.util.*;

abstract class Sum {
	abstract void TwoNumbersAddition();
}

class SumOfTwoNumbers extends Sum {
	@Override
	void TwoNumbersAddition() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Sum: " + (n1 + n2));
	}
}

class SumOfTwoGivenNumbers {
	public static void main(String args[]) {
		SumOfTwoNumbers add = new SumOfTwoNumbers();
		add.TwoNumbersAddition();
	}
}

//
//Input (stdin)
//5
//6
//
//Output (stdout)
//Sum: 11