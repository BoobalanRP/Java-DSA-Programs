package day05;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFindertoFindSecondMaximumAndMimimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int box1 = sc.nextInt();
		int box2 = sc.nextInt();
		int box3 = sc.nextInt();

		int[] array = { box1, box2, box3 };
		Arrays.sort(array); // Sort the array in ascending order
		// Arrays.sort(array, Comparator.reverseOrder()); // Sort the array in
		// descending order
		int secondLargest = array[array.length - 2]; // Access the second largest element

		int minimum = Arrays.stream(array).min().getAsInt();
		System.out.println("The treasure is in the box which has number " + secondLargest + ".");
		System.out.println("The code to open the box is " + minimum + ".");

	}

}
