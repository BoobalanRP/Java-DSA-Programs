package day22_Constructor;

import java.util.Scanner;

public class BoxLengthAndBreath {

	int len;
	int bre;
	int hei;

	public BoxLengthAndBreath(int len, int bre, int hei) {
		this.len = len;
		this.bre = bre;
		this.hei = hei;
	}

	public int getRadius() {
		return len * bre * hei;
	}

	public int getPerimeter() {
		return 4 * (len + bre + hei);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int bre = sc.nextInt();
		int hei = sc.nextInt();
		BoxLengthAndBreath result = new BoxLengthAndBreath(len, bre, hei);

		System.out.println("Perimeter:" + result.getPerimeter());
		System.out.println("Volume:" + result.getRadius());

	}
}

//Input (stdin)
//1
//2
//3
//
//Output (stdout)
//Perimeter:24
//Volume:6
