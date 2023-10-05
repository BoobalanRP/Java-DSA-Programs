package dsa_day01_sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 2, 1, 3, 8, 4, 7 };

		for (int i = 0; i < arr.length-1; i++) {
			int value = i;
			int first = arr[i];
			int min = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					value = j;
					min = arr[j];
				}
			}

			arr[i] = min;
			arr[value] = first;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
