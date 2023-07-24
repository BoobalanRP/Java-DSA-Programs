package day20_Exception;

import java.util.Scanner;

public class OppositeDirectionExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int friendSpeed = sc.nextInt();
		int yourSpeed = sc.nextInt();
		int distanceToFriend = sc.nextInt();

		if (friendSpeed <= yourSpeed) {
			System.out.println("Will never meet");
		} else {
			double relativeSpeed = friendSpeed - yourSpeed;
			double timeToMeet = (double) distanceToFriend / relativeSpeed;
			System.out.println(timeToMeet);
		}

	}

}

//Input (stdin)
//50 20 250
//
//
//Output (stdout)
//8.333333333333334
