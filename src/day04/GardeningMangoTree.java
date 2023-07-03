package day04;

import java.util.Scanner;

class GardeningMangoTree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int treeNumber = input.nextInt();
		if (treeNumber % columns == 2 || treeNumber / columns == columns - 1) {
			System.out.println("It is a mango tree");
		} else {
			System.out.println("It is not a mango tree");
		}
	}
}
