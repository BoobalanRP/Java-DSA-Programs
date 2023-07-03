package day06;

import java.util.Scanner;

public class TrendyNumbersFindTheMiddleValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String change = Integer.toString(n);
		char middleValue = change.charAt(1);
		int chageInt = Character.getNumericValue(middleValue);

		if (chageInt % 3 == 0) {
			System.out.println("Trendy Number");
		} else {
			System.out.println("Not a Trendy Number");
		}

	}

}
