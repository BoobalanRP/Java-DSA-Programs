package day25_encapsulation;

import java.util.Scanner;

public class CopyCopiesAndMoreOfThem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cho1 = sc.nextInt();
		sc.nextLine();
		String val1 = sc.nextLine();
		int cho2 = sc.nextInt();
		sc.nextLine();
		String val2 = sc.nextLine();

		int cal = 0;
		if (cho1 == 1 && val2.equals("yes")) {
			cal = (cho2 * 2) + 15;
		} else if (cho1 == 1 && val2.equals("no")) {
			cal = cho2 * 2;
		} else if (cho1 == 2 && val2.equals("yes")) {
			cal = (cho2 * 5) + 15;
		} else if (cho1 == 2 && val2.equals("no")) {
			cal = cho2 * 5;
		}

		if (cal > 1) {
			System.out.println("Xerox total price is: " + cal);
		} else {
			System.out.println("Invalid Input");
		}
	}

}

//Input (stdin)
//2
//Core Java - Fundamentals
//290 
//yes
//
//Output (stdout)
//Xerox total price is: 1465
