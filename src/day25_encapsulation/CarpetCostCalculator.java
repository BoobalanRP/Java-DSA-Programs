package day25_encapsulation;

class Floor {
	private double i;
	private double j;

	public Floor(double i, double j) {
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

	public double getArea() {
		return i * j;

	}
}

class Carpet {
	private double i;

	public Carpet(double i) {
		if (i <= 0) {
			i = 0;

		} else {
			this.i = i;
		}
	}

	public double getCost() {

		return i;
	}

}

class Calculator {
	private Floor a;
	private Carpet c;

	public Calculator(Floor a, Carpet c) {

		this.a = a;
		this.c = c;
	}

	public double getTotalCost() {

		return a.getArea() * c.getCost();
	}

}

public class CarpetCostCalculator {
	public static void main(String args[]) {
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("Total = " + calculator.getTotalCost());
	}
}

//
//Input (stdin)
//
//Output (stdout)
//Total = 38.5
//Total = 36.45