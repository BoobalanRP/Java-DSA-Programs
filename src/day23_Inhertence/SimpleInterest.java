package day23_Inhertence;

import java.util.*;

class SimpleInterest {
	int p;
	int n;
	int r;
	int si;

	public SimpleInterest(int p, int n, int r) {
		this.p = p;
		this.n = n;
		this.r = r;
	}

	public void simpleInterest() {
		System.out.println("Principle amount : " + p);
		System.out.println("No.Of.Years : " + n);
		System.out.println("Rate of interest : " + r);
		si = (p * n * r) / 100;
		System.out.println("Simple Interest : " + si);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		SimpleInterest si = new SimpleInterest(p, n, r);
		si.simpleInterest();
	}
}

//Input (stdin)
//1000
//7
//6
//
//Output (stdout)
//Principle amount : 1000
//No.Of.Years : 7
//Rate of interest : 6
//Simple Interest : 420