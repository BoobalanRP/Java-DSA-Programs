package DSA_day02_searching_and_sorting;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the size of the array
		int size = scanner.nextInt();

		// Read the elements of the array
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Close the scanner
		scanner.close();

		// Find the maximum element in the array
		int max = getMax(array);

		// Perform counting sort
		countingSort(array, max);

		// Print the sorted array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static int getMax(int[] array) {
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void countingSort(int[] array, int max) {
		int[] countingArray = new int[max + 1];

		// Count the occurrences of each element
		for (int num : array) {
			countingArray[num]++;
		}

		int index = 0;
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < countingArray[i]; j++) {
				array[index++] = i;
			}
		}

	}

}

//Input (stdin)
//13
//1 1 8 3 4 6 2 9 2 3 5 6 2
//
//Output (stdout)
//1 1 2 2 2 3 3 4 5 6 6 8 9
