package day23_Inhertence;

import java.util.*;

class Main {
	int val;

	public Main(int val) {
		this.val = val;
	}

	public int getSquare() {
		return val * val;
	}

	public int getCube() {
		return val * val * val;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		Main cq = new Main(val);
		System.out.println("Enter the side :");
		System.out.println("The square value is : " + cq.getSquare());
		System.out.println("The cube value is : " + cq.getCube());

	}
}

//Input (stdin)
//5
//
//Output (stdout)
//Enter the side :
//The square value is : 25
//The cube value is : 125