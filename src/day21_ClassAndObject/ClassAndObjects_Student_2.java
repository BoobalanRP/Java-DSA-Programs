package day21_ClassAndObject;

import java.util.Scanner;

public class ClassAndObjects_Student_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		sc.close(); // Close the Scanner after reading input to free resources

		System.out.println(name);
		System.out.println(val1);
		System.out.println(val2 + "%"); // Add a space after val2

		sc.close(); // Close the Scanner after reading input to free resources

	}
}

//
//Input (stdin)
//jijo
//40
//80
//
//Output (stdout)
//jijo
//40
//80%