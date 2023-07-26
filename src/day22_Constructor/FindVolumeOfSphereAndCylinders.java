package day22_Constructor;

import java.util.Scanner;

public class FindVolumeOfSphereAndCylinders {

	int len;
	int bre;
	int hei;
	float rad;

	public FindVolumeOfSphereAndCylinders(int len, int bre, int hei) {
		this.len = len;
		this.bre = bre;
		this.hei = hei;
	}

	public int getVolumeOfCube() {
		return len * bre * hei;
	}

	public FindVolumeOfSphereAndCylinders(float rad) {
		this.rad = rad;
	}

	public float getVolumeOfSphere() {
		return (float) ((4.0 / 3.0) * 3.14 * rad * rad * rad);
	}

	public FindVolumeOfSphereAndCylinders(float rad, int hei) {
		this.rad = rad;
		this.hei = hei;
	}

	public float getVolumeOfCylinder() {
		return (float) (3.14 * rad * rad * hei);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Cube");
		System.out.println("2.Sphere");
		System.out.println("3.Cylinder");
		System.out.println("Enter the choice");
		int cho = sc.nextInt();
		if (cho == 1) {
			int len = sc.nextInt();
			int bre = sc.nextInt();
			int hei = sc.nextInt();
			FindVolumeOfSphereAndCylinders res = new FindVolumeOfSphereAndCylinders(len, bre, hei);

			System.out.println("length");
			System.out.println("breadth");
			System.out.println("height");
			System.out.println("Area of Cube is " + res.getVolumeOfCube());
		} else if (cho == 2) {
			int rad = sc.nextInt();
			FindVolumeOfSphereAndCylinders res = new FindVolumeOfSphereAndCylinders(rad);

			System.out.println("radius");
			System.out.printf("Area of Sphere is %.2f", res.getVolumeOfSphere());
		} else if (cho == 3) {
			int rad = sc.nextInt();
			int hei = sc.nextInt();
			FindVolumeOfSphereAndCylinders res = new FindVolumeOfSphereAndCylinders(rad, hei);

			System.out.println("radius");
			System.out.println("height");
			System.out.printf("Area of Cylinders is %.1f", res.getVolumeOfCylinder());
		}
	}
}

//Input (stdin)
//1
//10
//20
//30
//
//Output (stdout)
//1.Cube
//2.Sphere
//3.Cylinder
//Enter the choice
//length
//breadth
//height
//Area of Cube is 6000
