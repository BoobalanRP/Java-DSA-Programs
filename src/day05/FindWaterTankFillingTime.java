package day05;

import java.util.Scanner;

public class FindWaterTankFillingTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		float waterPerHour = sc.nextFloat();
		float totalHours = sc.nextFloat();

		// Calculate the volume of the tank
		float tankVolume = (float) (Math.PI * radius * radius * height);
		//The formula for the volume of a cylinder is π * r^2 * h, where r is the radius of the base and h is the height of the cylinder.
		//By using Math.PI, the code accesses the value of π to perform the calculation accurately.
		// Calculate the total water received
		float totalWaterReceived = waterPerHour * totalHours;

		if (totalWaterReceived >= tankVolume) {
			System.out.println("The tank can be filled within " + totalHours + " hours");
		} else {
			System.out.println("The tank cannot be filled within " + totalHours + " hours");
		}
	}
}
