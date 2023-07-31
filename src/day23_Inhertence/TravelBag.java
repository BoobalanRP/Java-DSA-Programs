package day23_Inhertence;

import java.util.Scanner;

class Bag {
	int num;
	String name;

	public Bag(int num) {
		if (num <= 6) {
			name = "BAG : I choose Weekenders";
		} else {
			name = "BAG : I choose Duffle";
		}
	}

	public String getName() {
		return name;
	}
}

public class TravelBag {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Bag val = new Bag(num);

		System.out.println(val.getName());
	}
}

//Input (stdin)
//4
//
//Output (stdout)
//BAG : I choose Weekenders