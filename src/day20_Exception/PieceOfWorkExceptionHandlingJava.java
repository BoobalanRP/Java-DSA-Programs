package day20_Exception;

import java.util.Scanner;

public class PieceOfWorkExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt(), lcm;
		lcm = (n1 > n2) ? n1 : n2;
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				break;
			}
			++lcm;
		}
		double val1 = (double) lcm / n1;
		double val2 = (double) lcm / n2;

		double result = (double) lcm / (val1 + val2);

		System.out.print(result);

	}

}

//Input (stdin)
//10 20
//
//Output (stdout)
//6.666666666666667