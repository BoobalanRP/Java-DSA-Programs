package day03;

import java.util.Scanner;

public class DistanceBetweenTheCoordinates {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int x = n.nextInt();
		int y = n.nextInt();

		int coordinates = (int) Math.sqrt(Math.pow((x - 3), 2) + Math.pow((y - 4), 2));

		System.out.println(coordinates);

	}

}
