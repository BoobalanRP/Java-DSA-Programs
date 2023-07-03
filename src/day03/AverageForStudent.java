package day03;

import java.util.Scanner;

public class AverageForStudent {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		float s1 = n.nextInt();
		float s2 = n.nextInt();
		float s3 = n.nextInt();
		float s4 = n.nextInt();
		float s5 = n.nextInt();

		float avg = (s1 + s2 + s3 + s4 + s5) / 5;

		System.out.printf("%.2f", avg);

	}

}
