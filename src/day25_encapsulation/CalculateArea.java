package day25_encapsulation;

import java.util.Scanner;

class Area {
	private int i;
	private int j;

	public Area(int i, int j) {
		if (i <= 0) {
			i = 0;
			this.j = j;

		} else if (j <= 0) {
			j = 0;
			this.i = i;

		} else {
			this.i = i;
			this.j = j;
		}
	}

	public int getArea() {
		return i * j;

	}

}

class Cost {
	private int i;

	public Cost(int i) {
		if (i <= 0) {
			i = 0;

		} else {
			this.i = i;
		}
	}

	public int getCost() {

		return i;
	}

}

class Calculate {
	private Area a;
	private Cost c;

	public Calculate(Area a, Cost c) {

		this.a = a;
		this.c = c;
	}

	public int getCalculate() {

		return a.getArea() * c.getCost();
	}

}

public class CalculateArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		Area a = new Area(n1, n2);
		Cost c = new Cost(n3);
		Calculate cal = new Calculate(a, c);
		System.out.println("Calculated value: " + cal.getCalculate());

	}

}
