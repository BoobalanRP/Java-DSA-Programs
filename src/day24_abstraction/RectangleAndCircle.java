package day24_abstraction;

import java.util.*;

abstract class Rectangle {
	abstract void Circle();
}

class TheCircle extends Rectangle {
	@Override
	void Circle() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Rectangle");
		System.out.println("The given input is " + num);
		System.out.println("Circle");
		System.out.println("The given input is " + num);
	}
}

class RectangleAndCircle {
	public static void main(String args[]) {
		TheCircle title = new TheCircle();
		title.Circle();
	}
}