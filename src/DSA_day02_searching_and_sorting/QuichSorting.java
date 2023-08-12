package DSA_day02_searching_and_sorting;

import java.util.Scanner;

//Input (stdin)
//3
//12
//15
//14
//
//Output (stdout)
//12 14 15
public class QuichSorting {

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

		// Perform quicksort on the array
		quickSort(array, 0, size - 1);

		// Print the sorted array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	// Quicksort implementation
	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	// Partitioning step
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, high);
		return i + 1;
	}

	// Utility method to swap two elements in an array
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
