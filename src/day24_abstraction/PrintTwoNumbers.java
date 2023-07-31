package day24_abstraction;

import java.util.*;

abstract class Num {
	abstract void Numbers();
}

class TwoNumbers extends Num {
	@Override
	void Numbers() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("a = " + n1);
		System.out.println("b = " + n2);
	}
}

public class PrintTwoNumbers {

	public static void main(String args[]) {
		TwoNumbers add = new TwoNumbers();
		add.Numbers();
	}

}
//Input (stdin)
//5
//19
//
//Output (stdout)
//a = 5
//b = 19