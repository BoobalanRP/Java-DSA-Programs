package day20_Exception;

import java.util.Scanner;

public class TrainExceptionHandlingJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distanceApart = sc.nextInt();
		int speedTrain1 = sc.nextInt();
		int speedTrain2 = sc.nextInt();
		int speedMosquito = sc.nextInt();

		double timeToCollision = (double) distanceApart / (speedTrain1 + speedTrain2);

		double distanceMosquitoTravels = timeToCollision * speedMosquito;
		System.out.println(distanceMosquitoTravels);

	}

}

//Input (stdin)
//200 50 50 75
//
//
//Output (stdout)
//150.0