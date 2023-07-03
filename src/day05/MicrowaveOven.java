package day05;

import java.util.Scanner;

//
//Microwave Oven
//A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time.
//Heating more than three items at once is not recommended. Write a program to find out the recommended heating time.
//
//Input format:
//The first input containing an integer which denotes the number of items
//The second input containing the floating point number which denotes the single item heating time.
//
//
//Output format:
//Print the recommended heating time in floating point with 2 decimal places.
//If the number of items is more than three, print "Number of items is more" 

public class MicrowaveOven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfItem = sc.nextInt();
		float heatingTime = sc.nextFloat();
		float heat = (float) 0.0;
		if (noOfItem == 1) {
			System.out.println(heatingTime);
		} else if (noOfItem == 2) {
			System.out.printf("%.2f", heatingTime + (heatingTime * 0.5));
		} else if (noOfItem == 3) {
			System.out.printf("%.2f", (heatingTime + heatingTime));
		} else {
			System.out.println("Number of items is more");
		}

	}

}
