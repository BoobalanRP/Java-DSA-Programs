package day05;

import java.util.Scanner;

public class SeceDinningFindLeftHandorRightHand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String door = scanner.nextLine();
		int rail = scanner.nextInt();

		if (door.equals("front") && rail == 1) {
			System.out.println("Left Handed");
		} else if (door.equals("front") && rail == 2) {
			System.out.println("Right Handed");
		} else if (door.equals("front") && rail == 0) {
			System.out.println("Right Handed");
		} else if (door.equals("rear") && rail == 1) {
			System.out.println("Right Handed");
		} else if (door.equals("rear") && rail == 0) {
			System.out.println("Left Handed");
		} else if (door.equals("rear") && rail == 2) {
			System.out.println("Left Handed");
		}

	}

}
