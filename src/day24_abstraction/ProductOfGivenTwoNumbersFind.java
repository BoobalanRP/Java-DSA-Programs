package day24_abstraction;

import java.util.*;

abstract class Product {
	abstract void ProductOfTwoNumbers();
}

class ProductOfGivenTwoNumbers extends Product {
	@Override
	void ProductOfTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(n1 * n2);
	}
}

class ProductOfGivenTwoNumbersFind {
	public static void main(String args[]) {
		ProductOfGivenTwoNumbers add = new ProductOfGivenTwoNumbers();
		add.ProductOfTwoNumbers();
	}
}

//Input (stdin)
//5
//6
//
//Output (stdout)
//30