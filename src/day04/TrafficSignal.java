package day04;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float currentSpeed = sc.nextFloat();
		float distanceToLight = sc.nextFloat();
		float timeUntilRed = sc.nextFloat();

		float timeToReachLight = currentSpeed / distanceToLight;

		if (timeToReachLight > timeUntilRed) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
