package day26_polymorphisym;

import java.util.Scanner;

class NutShape {
	public int calculateArea(int length, int breadth) {
		return 0;
	}
}

class Rectangle extends NutShape {
	@Override
	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}
}

class Triangle extends NutShape {
	@Override
	public int calculateArea(int length, int breadth) {
		return (length * breadth) / 2;
	}
}

public class ReaOfRectangleAndTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rectangleLength = scanner.nextInt();
		int rectangleBreadth = scanner.nextInt();

		NutShape rectangle = new Rectangle();
		NutShape triangle = new Triangle();

		int rectangleArea = rectangle.calculateArea(rectangleLength, rectangleBreadth);
		int triangleArea = triangle.calculateArea(rectangleLength, rectangleBreadth);

		System.out.println(rectangleArea);
		System.out.println(triangleArea);

		scanner.close();
	}
}

//Input (stdin)
//5
//5
//
//Output (stdout)
//25
//12
