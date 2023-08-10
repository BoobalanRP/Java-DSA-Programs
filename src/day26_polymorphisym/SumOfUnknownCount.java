package day26_polymorphisym;

import java.util.Scanner;

public class SumOfUnknownCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sc.hasNext()) {
			sum += sc.nextInt();
		}
		System.out.println(sum);

	}

}

//Input (stdin)
//100 12
//
//Output (stdout)
//112