package day26_polymorphisym;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorial = 1;
		int addtion = 0;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
			addtion += i;
		}
		System.out.println(factorial);
		System.out.println(addtion);
	}
}

//Input (stdin)
//5
//
//Output (stdout)
//120
//15