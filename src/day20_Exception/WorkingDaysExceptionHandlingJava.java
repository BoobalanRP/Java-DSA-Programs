package day20_Exception;

import java.util.Scanner;

public class WorkingDaysExceptionHandlingJava {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int d1 = sc.nextInt();
		int h1 = sc.nextInt();
		int w1 = sc.nextInt();
		int n2 = sc.nextInt();
		int d2 = sc.nextInt();
		int h2 = sc.nextInt();
		double w2 = 0;

		w2 = (double) (d2 * h2 * n2 * w1) / (n1 * h1 * d1);
		System.out.println(w2);
	}

}

//Input (stdin)
//10 10 10 10
//8 8 8 
//
//Output (stdout)
//5.12