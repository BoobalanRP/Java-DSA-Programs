package day24_abstraction;

import java.util.*;

abstract class NumValue {
	abstract void PrintNum();
}

class PrintNumbers extends NumValue {
	@Override
	void PrintNum() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		System.out.println("Base class constructor");
		System.out.println("Derived class constructor");
		System.out.println("The given input is " + n1);
	}
}

public class PrintString {

	public static void main(String args[]) {
		PrintNumbers add = new PrintNumbers();
		add.PrintNum();
	}
}

//
//Input (stdin)
//6
//
//Output (stdout)
//Base class constructor
//Derived class constructor
//The given input is 6