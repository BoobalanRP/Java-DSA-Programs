package day26_polymorphisym;

import java.util.*;

class Compute {
	public double area(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public double area(int length, int breadth) {
		return length * breadth;
	}

	public double shadedArea(int radius1, int radius2, int length, int breadth) {
		double circle1Area = Math.ceil(area(radius1));
		double circle2Area = Math.ceil(area(radius2));
		double rectangleArea = area(length, breadth);

		return rectangleArea - ((4 * circle1Area) + circle2Area);
	}
}

class AreaShadedRegion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius1 = sc.nextInt();
		int radius2 = sc.nextInt();
		int length = sc.nextInt();
		int breadth = sc.nextInt();

		Compute compute = new Compute();
		double shadedArea = compute.shadedArea(radius1, radius2, length, breadth);

		System.out.println("Area of Shaded Region : " + (int) shadedArea + " meter square");
	}
}

//Input (stdin)
//21
//49
//100
//200
//
//Output (stdout)
//Area of Shaded Region : 6913 meter square