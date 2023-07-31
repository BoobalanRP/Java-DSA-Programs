package day24_abstraction;

import java.util.Scanner;

abstract class Marks {
	abstract int getPercentage();
}

class A extends Marks {
	private int sub1, sub2, sub3;

	A(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}

	@Override
	int getPercentage() {
		int total = sub1 + sub2 + sub3;
		return total / 3;
	}
}

class B extends Marks {
	private int sub1, sub2, sub3, sub4;

	B(int s1, int s2, int s3, int s4) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
	}

	@Override
	int getPercentage() {
		int total = sub1 + sub2 + sub3 + sub4;
		return total / 4;
	}
}

public class CalculateThePercentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int marksA1 = sc.nextInt();
		int marksA2 = sc.nextInt();
		int marksA3 = sc.nextInt();

		int marksB1 = sc.nextInt();
		int marksB2 = sc.nextInt();
		int marksB3 = sc.nextInt();
		int marksB4 = sc.nextInt();

		A studentA = new A(marksA1, marksA2, marksA3);
		B studentB = new B(marksB1, marksB2, marksB3, marksB4);

		int percentageA = studentA.getPercentage();
		int percentageB = studentB.getPercentage();

		System.out.println("Percentage of Student1:" + percentageA);
		System.out.println("Percentage of Student2:" + percentageB);
	}
}

//Input (stdin)
//100
//89
//76
//98
//93
//75
//56
//
//Output (stdout)
//Percentage of Student1:88
//Percentage of Student2:80