package day26_polymorphisym;

import java.util.*;

class Addition {
	int val1;
	int val2;

	public Addition(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getAddition() {
		return val1 + val2;
	}
}

public class AddtionOfTwoNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Addition add = new Addition(n1, n2);

		System.out.println(add.getAddition());
	}
}

//Input (stdin)
//1260
//3905
//
//Output (stdout)
//5165
