package day04;

import java.util.Scanner;

public class FindMangoFirstPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int treeNumber = input.nextInt();
		if (treeNumber <= columns || treeNumber % columns == 1 || treeNumber % columns == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
