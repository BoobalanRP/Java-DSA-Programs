package day11;

import java.util.Scanner;

public class RemoveTheGivenPositionNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int remove = sc.nextInt();
		if (remove > arr.length) {
			System.out.println("Enter the number of elements in the array");
			System.out.println("Enter the elements in the array");
			System.out.println("Enter the location where you wish to delete an element");
			System.out.println("Invalid Input");
			return;
		}

		System.out.println("Enter the number of elements in the array");
		System.out.println("Enter the elements in the array");
		System.out.println("Enter the location where you wish to delete an element");
		System.out.println("Array after deletion is");
		for (int i = 0; i < arr.length; i++) {
			if (i == (remove - 1)) {
				continue;
			}
			System.out.println(arr[i]);
		}

	}

}
