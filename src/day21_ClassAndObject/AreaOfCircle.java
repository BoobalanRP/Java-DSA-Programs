package day21_ClassAndObject;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Radius:");
		int radius = sc.nextInt();
		sc.close();

		float area = (float) calculateArea(radius);
		System.out.print("Area of Circle: " + area);
	}

	public static double calculateArea(int radius) {
		return 3.14 * radius * radius;
	}

}

//Input (stdin)
//6
//
//Output (stdout)
//Enter the value of Radius:
//Area of Circle: 113.04